package com.example.vinay.week1Introduction.introductionToSpringBoot.week2.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class DepartmentRoleValidator implements ConstraintValidator<DepartmentRoleValidation, String> {

    @Override
    public boolean isValid(String inputRole, ConstraintValidatorContext constraintValidatorContext) {
        List<String> roles = List.of("ADMIN", "DEAN");
        return roles.contains(inputRole.toUpperCase());
    }
}
