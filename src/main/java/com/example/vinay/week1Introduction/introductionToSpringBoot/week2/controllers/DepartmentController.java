package com.example.vinay.week1Introduction.introductionToSpringBoot.week2.controllers;

import com.example.vinay.week1Introduction.introductionToSpringBoot.week2.dto.DepartmentDTO;
import com.example.vinay.week1Introduction.introductionToSpringBoot.week2.exceptions.ResourceNotFoundException;
import com.example.vinay.week1Introduction.introductionToSpringBoot.week2.services.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "/department")
public class DepartmentController {

    private final DepartmentService departmentService;
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(path = "/{departmentId}")
    public ResponseEntity<DepartmentDTO> getDepartmentById(@PathVariable(name = "departmentId") Long Id) {
        Optional<DepartmentDTO> departmentDTO = departmentService.getDepartmentById(Id);
        return departmentDTO
               .map(departmentDTO1 -> ResponseEntity.ok(departmentDTO1))
               .orElseThrow(() -> new ResourceNotFoundException("Department not found with id: "+Id));
    }

    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> getAllDepartments(@RequestParam(required = false, name = "inputAge") Integer age,
                                                    @RequestParam(required = false) String sortBy) {
        return ResponseEntity.ok(departmentService.getAllDepartments());
    }

    @PostMapping
    public ResponseEntity<DepartmentDTO> createNewDepartment(@RequestBody @Valid DepartmentDTO departmentDTO) {
        DepartmentDTO savedDepartment = departmentService.createNewDepartment(departmentDTO);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{departmentId}")
    public ResponseEntity<DepartmentDTO> updateDepartmentById(@RequestBody @Valid DepartmentDTO departmentDTO, @PathVariable Long departmentId) {
        return ResponseEntity.ok(departmentService.updateDepartmentById(departmentId, departmentDTO));
    }

    @DeleteMapping(path = "/{departmentId}")
    public ResponseEntity<Boolean> deleteDepartmentById(@PathVariable Long departmentId) {
        boolean gotDeleted = departmentService.deleteDepartmentById(departmentId);
        if (gotDeleted) return ResponseEntity.ok(true);
        return ResponseEntity.notFound().build();
    }

    @PatchMapping(path = "/{departmentId}")
    public ResponseEntity<DepartmentDTO> updatePartialDepartmentById(@RequestBody Map<String, Object> updates, @PathVariable Long departmentId) {
        DepartmentDTO departmentDTO = departmentService.updatePartialDepartmentById(departmentId, updates);
        if (departmentDTO == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(departmentDTO);
    }

}


