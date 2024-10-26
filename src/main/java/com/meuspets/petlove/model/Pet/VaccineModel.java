package com.meuspets.petlove.model.Pet;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "VaccineModel")
@Table(name = "vaccines")
public class VaccineModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pet_id;
    @Column(name = "name_vaccine", nullable = false)
    private String nameVaccine;
    @Column(name = "vaccine_date", nullable = false)
    private LocalDate vaccineDate;
    @Column(name = "validity_date", nullable = false)
    private LocalDate validityDate;
    @Column(name = "dose", nullable = false)
    private int dose;
    @Column(name = "notes", nullable = false)
    private String notes;
    @Column(name = "manufacturer", nullable = false)
    private String manufacturer;

    public VaccineModel() {
    }

    public VaccineModel(String nameVaccine, LocalDate vaccineDate, LocalDate validityDate, int dose, String notes, String manufacturer) {
        this.nameVaccine = nameVaccine;
        this.vaccineDate = vaccineDate;
        this.validityDate = validityDate;
        this.dose = dose;
        this.notes = notes;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return pet_id;
    }

    public void setId(int id) {
        this.pet_id = id;
    }

    public String getNameVaccine() {
        return nameVaccine;
    }

    public void setNameVaccine(String nameVaccine) {
        this.nameVaccine = nameVaccine;
    }

    public LocalDate getVaccineDate() {
        return vaccineDate;
    }

    public void setVaccineDate(LocalDate vaccineDate) {
        this.vaccineDate = vaccineDate;
    }

    public LocalDate getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(LocalDate validityDate) {
        this.validityDate = validityDate;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
