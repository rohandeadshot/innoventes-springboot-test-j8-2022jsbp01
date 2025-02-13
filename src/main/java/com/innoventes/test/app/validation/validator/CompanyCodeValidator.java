package com.innoventes.test.app.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.innoventes.test.app.validation.annotation.ValidCompanyCode;

@Component
public class CompanyCodeValidator implements ConstraintValidator<ValidCompanyCode, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) return true; // non-mandatory
        
        return value.length() == 5 && 
               value.substring(0,2).matches("[a-zA-Z]{2}") &&
               value.substring(2,4).matches("[0-9]{2}") &&
               value.substring(4).matches("[eEnN]");
    }

}
