package com.springproject.gestionemployes.Services.impl;

import com.springproject.gestionemployes.Services.EmployeService;
import com.springproject.gestionemployes.models.Employe;
import com.springproject.gestionemployes.repositories.EmployeRepository;
import lombok.Data;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Data
public class EmployeServiceImpl implements EmployeService {

    final EmployeRepository employeRepository;

    @Override
    public Employe save(Employe employe) throws Exception{
        Employe employeDB = employeRepository.findById(employe.getCode()).orElse(null);
        if (employeDB != null)
            throw new Exception("Employe déja existe!");
        return employeRepository.save(employe);
    }

    @Override
    public Employe update(Employe employe) throws Exception {
        Employe employeDB = employeRepository.findById(employe.getCode()).orElse(null);
        if (employeDB == null)
            throw new Exception("Employe n'existe pas!");
        employe.setCode(employeDB.getCode());
        return employeRepository.save(employe);
    }

    @Override
    public Long delete(Long id) throws Exception{
        Employe employeDB = employeRepository.findById(id).orElse(null);
        if (employeDB == null)
            throw new Exception("Employe n'existe pas!");
        employeRepository.delete(employeDB);
        return id;
    }

    @Override
    public List<Employe> findAll() {
        return employeRepository.findAll();
    }

}