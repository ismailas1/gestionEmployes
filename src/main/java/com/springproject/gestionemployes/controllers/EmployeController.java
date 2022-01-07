package com.springproject.gestionemployes.controllers;

import com.springproject.gestionemployes.Services.EmployeService;
import com.springproject.gestionemployes.controllers.dto.EmployeDTO;
import com.springproject.gestionemployes.models.Employe;
import com.springproject.gestionemployes.repositories.EmployeRepository;
import com.springproject.gestionemployes.converter.EmployeConverter;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("Employes")
@Data
public class EmployeController {

    final EmployeService employeService;
    final EmployeConverter employeConverter;

    @PostMapping("/")
    public ResponseEntity<?> save(@Valid @RequestBody EmployeDTO employeDTO) throws Exception {
        if (employeDTO == null)
            return ResponseEntity.badRequest().body("Employe non valide!");
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(employeConverter.convertToDTO(employeService.save(employeConverter.convertToDM(employeDTO))));
    }

    @PutMapping("/")
    public ResponseEntity<?> update(@Valid @RequestBody EmployeDTO employeDTO) throws Exception {
        if (employeDTO == null)
            return ResponseEntity.badRequest().body("Employe non valide!");
        return ResponseEntity
                .ok()
                .body(employeConverter.convertToDTO(employeService.update(employeConverter.convertToDM(employeDTO))));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
        if (id == null)
            return ResponseEntity.badRequest().body("Le code Employe non valide!");
        return ResponseEntity.ok().body("Employe [" + employeService.delete(id) + "] supprimer avec succés.");
    }

    @GetMapping("/")
    public ResponseEntity<List<EmployeDTO>> findAll() {
        return ResponseEntity.ok().body(employeConverter.convertToDTOs(employeService.findAll()));
    }





}
