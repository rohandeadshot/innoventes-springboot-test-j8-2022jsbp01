package com.innoventes.test.app.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.innoventes.test.app.validation.validator.CompanyCodeValidator;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CompanyCodeValidator.class)
public @interface ValidCompanyCode {
    String message() default "Invalid company code format";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
