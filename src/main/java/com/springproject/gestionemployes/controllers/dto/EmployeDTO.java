package com.springproject.gestionemployes.controllers.dto;

import lombok.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Data
public class  EmployeDTO {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long code;

    @NotBlank(message = "le nom est obligatoire")
    private String nom;

    @NotBlank(message = "le prenom est obligatoire")
    private String prenom;

    @NotBlank(message = "CIN est obligatoire")
    private String cin;
    private String tel;
    private String adresse;


    @Email(message = "l'email doit être valide")
    private String email;

    private String dateNaissance;
    private String lieuNaissance;
    private String situationFam;
    private Integer nbrEnfants;
    private String dateEntree;
    private String fonction;





}
