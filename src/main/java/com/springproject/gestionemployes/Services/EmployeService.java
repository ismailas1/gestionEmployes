package com.springproject.gestionemployes.Services;

import com.springproject.gestionemployes.models.Employe;

 import java.util.List;

public interface EmployeService {

 Employe save(Employe employe) throws Exception;
 Employe update(Employe employe) throws Exception;
 Long delete(Long id) throws Exception;
 List<Employe> findAll();

}
