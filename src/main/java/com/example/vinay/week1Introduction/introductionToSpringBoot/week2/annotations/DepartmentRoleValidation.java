package com.example.vinay.week1Introduction.introductionToSpringBoot.week2.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = {DepartmentRoleValidator.class})
public @interface DepartmentRoleValidation {
    String message() default "Role of Department can either be ADMIN or DEAN";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
