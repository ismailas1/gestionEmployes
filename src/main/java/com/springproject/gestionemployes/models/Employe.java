package com.springproject.gestionemployes.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long code;
    private String nom;
    private String prenom;
    private String cin;
    private String tel;
    private String adresse;
    private String email;

    private String dateNaissance;
    private String lieuNaissance;
    private String situationFam;
    private Integer nbrEnfants;
    private String dateEntree;
    private String fonction;

    public Employe() {
        super();
    }
    public Employe(Long code, String nom, String prenom, String cin, String tel, String adresse,String email, String dateNaissance, String lieuNaissance, String situationFam, Integer nbrEnfants, String dateEntree, String fonction) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.tel = tel;
        this.adresse = adresse;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.situationFam = situationFam;
        this.nbrEnfants = nbrEnfants;
        this.dateEntree = dateEntree;
        this.fonction = fonction;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getSituationFam() {
        return situationFam;
    }

    public void setSituationFam(String situationFam) {
        this.situationFam = situationFam;
    }

    public Integer getNbrEnfants() {
        return nbrEnfants;
    }

    public void setNbrEnfants(Integer nbrEnfants) {
        this.nbrEnfants = nbrEnfants;
    }


    public String getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(String dateEntree) {
        this.dateEntree = dateEntree;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
}
