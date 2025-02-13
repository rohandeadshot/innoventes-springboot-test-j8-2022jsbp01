package com.innoventes.test.app.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.innoventes.test.app.validation.annotation.EvenNumberOrZero;

public class EvenNumberOrZeroValidator implements ConstraintValidator<EvenNumberOrZero, Number> {
    @Override
    public void initialize(EvenNumberOrZero constraintAnnotation) {}

    @Override
    public boolean isValid(Number value, ConstraintValidatorContext context) {
        if (value == null) return true;
        long num = value.longValue();
        return num == 0 || num % 2 == 0;
    }
}
