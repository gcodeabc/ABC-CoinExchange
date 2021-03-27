package com.ABC.bitrade.annotation;


import java.lang.annotation.*;

import com.ABC.bitrade.constant.AdminModule;

@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface AccessLog {
    String operation();
    AdminModule module();
}

