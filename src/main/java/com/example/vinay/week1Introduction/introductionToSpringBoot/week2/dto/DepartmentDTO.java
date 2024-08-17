package com.example.vinay.week1Introduction.introductionToSpringBoot.week2.dto;

import com.example.vinay.week1Introduction.introductionToSpringBoot.week2.annotations.DepartmentRoleValidation;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {


    private Long id;

   @NotBlank(message = "Required field in Department: title")
    private String title;

    @JsonProperty("isActive")
    private Boolean isActive;

    @DepartmentRoleValidation
    private String role;

    @PastOrPresent(message = "Created Date should not be in future")
    private LocalDate createdAt;
}
