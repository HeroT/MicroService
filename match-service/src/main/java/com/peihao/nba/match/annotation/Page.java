package com.peihao.nba.match.annotation;

import java.lang.annotation.*;

/**
 * Created by TPH on 2017/6/25.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Page {
    int defaultPageNumber() default -1;

    int defaultPageSize() default -1;

    int maxPageSize() default -1;
}
