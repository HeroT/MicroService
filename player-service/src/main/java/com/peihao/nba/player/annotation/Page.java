package com.peihao.nba.player.annotation;

import java.lang.annotation.*;

/**
 * Created by LijingYe on 2017/06/24.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Page {
    int defaultPageNumber() default -1;

    int defaultPageSize() default -1;

    int maxPageSize() default -1;
}
