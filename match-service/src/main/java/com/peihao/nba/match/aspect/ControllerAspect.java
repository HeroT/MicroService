package com.peihao.nba.match.aspect;

import com.peihao.nba.match.annotation.Page;
import com.peihao.nba.match.exception.PagingFailedException;
import com.peihao.nba.match.reponse.SuccessResponse;
import com.peihao.nba.match.utility.ThreadLocalKey;
import com.peihao.nba.match.utility.ThreadLocalUtility;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * Created by TPH on 2017/6/24.
 */
@Aspect
@Component
public class ControllerAspect {
    @Value("${page.number.defaultValue}")
    private Integer defaultPageNumber;

    @Value("${page.size.defaultValue}")
    private Integer defaultPageSize;

    @Value("${page.size.maxValue}")
    private Integer maxPageSize;

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping) " +
            "&& execution(public * com.peihao.nba.*.controller..*.*(..))")
    public void requestMappingMethodPointcut() {
    }

    @Around("requestMappingMethodPointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result = proceedingJoinPoint.proceed();
        if (null != result && result instanceof List) {
            Signature signature = proceedingJoinPoint.getSignature();
            Page page = proceedingJoinPoint.getTarget().getClass().getMethod(signature.getName(), ((MethodSignature)
                    signature).getParameterTypes()).getAnnotation(Page.class);
            if (null != page) {
                Integer pageNumber = getPageNumber(page);
                Integer pageSize = getPageSize(page);
                if (pageNumber > 0 && pageSize > 0) {
                    List list = ((List) result);
                    int total = list.size();
                    int fromIndex = (pageNumber - 1) * pageSize;
                    if (fromIndex > total)
                        return new SuccessResponse(Collections.emptyList(), total, pageNumber, pageSize);
                    return new SuccessResponse(list.subList(fromIndex, Math.min(fromIndex + pageSize, total)), total,
                            pageNumber, pageSize);
                }
                throw new PagingFailedException(pageNumber, pageSize);
            }
        }
        return new SuccessResponse(result);
    }

    private Integer getPageNumber(Page page) {
        Integer threadLocalPageNumber = ThreadLocalUtility.getInteger(ThreadLocalKey.QUERY_PAGE_NUMBER);
        if (isPositiveInteger(threadLocalPageNumber)) {
            return threadLocalPageNumber;
        }
        Integer annotationDefaultPageNumber = page != null ? page.defaultPageNumber() : null;
        return isPositiveInteger(annotationDefaultPageNumber) ? annotationDefaultPageNumber :
                defaultPageNumber;
    }

    private Integer getPageSize(Page page) {
        Integer pageSize = defaultPageSize;
        Integer annotationDefaultPageSize = page != null ? page.defaultPageSize() : null;
        if (isPositiveInteger(annotationDefaultPageSize))
            pageSize = annotationDefaultPageSize;
        Integer threadLocalPageSize = ThreadLocalUtility.getInteger(ThreadLocalKey.QUERY_PAGE_SIZE);
        if (isPositiveInteger(threadLocalPageSize))
            pageSize = threadLocalPageSize;
        Integer annotationMaxPageSize = page != null ? page.maxPageSize() : null;
        if (isPositiveInteger(annotationMaxPageSize))
            pageSize = Math.min(pageSize, annotationMaxPageSize);
        return Math.min(pageSize, maxPageSize);
    }

    private boolean isPositiveInteger(Integer integer) {
        return null != integer && integer > 0;
    }
}