package com.example.vinay.week1Introduction.introductionToSpringBoot.week2.repositories;

import com.example.vinay.week1Introduction.introductionToSpringBoot.week2.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
