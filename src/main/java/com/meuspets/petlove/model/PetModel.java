package com.meuspets.petlove.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.meuspets.petlove.model.Pet.VaccineModel;
import enums.DogsEnums;
import enums.LifeAnimalsEnum;
import enums.TypeAnimals;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "PetModel")
@Table(name =  "pets",schema = "petrg")
public class PetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "usuario_id", nullable = false)
    private int id_usuario;
    @Column(name = "name_pet", nullable = false)
    private String namePet;
    @Column(name = "age_pet", nullable = false)
    private int agePet;
    @Column(name = "race", nullable = false)
    private DogsEnums race;
    @Column(name = "type_animal", nullable = false)
    private TypeAnimals typeAnimal;
    @Column(name = "weight_pet", nullable = false)
    private Double weightPet;
    @Column(name = "observation", nullable = false)
    private String observation;
    @Column(name = "photo", nullable = false)
    private String photo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Column(name = "castrated_date", nullable = false)
    private LocalDate castratedDate;
    @Column(name = "life_animal", nullable = false)
    private LifeAnimalsEnum lifeAnimal;

    public PetModel() {
    }



    public PetModel(int id,String namePet, int agePet, DogsEnums race, TypeAnimals typeAnimal, Double weightPet, String observation, String photo, LocalDate castratedDate, LifeAnimalsEnum lifeAnimal) {
        this.id_usuario = id;
        this.namePet = namePet;
        this.agePet = agePet;
        this.race = race;
        this.typeAnimal = typeAnimal;
        this.weightPet = weightPet;
        this.observation = observation;
        this.photo = photo;
        this.castratedDate = castratedDate;
        this.lifeAnimal = lifeAnimal;
    }

    @Override
    public String toString() {
        return "PetModel{" +
                "id=" + id +
                ", namePet='" + namePet + '\'' +
                ", agePet=" + agePet +
                ", race=" + race +
                ", typeAnimal=" + typeAnimal +
                ", weightPet=" + weightPet +
                ", observation='" + observation + '\'' +
                ", photo='" + photo + '\'' +
                ", castratedDate=" + castratedDate +
                ", lifeAnimal=" + lifeAnimal +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public int getAgePet() {
        return agePet;
    }

    public void setAgePet(int agePet) {
        this.agePet = agePet;
    }

    public DogsEnums getRace() {
        return race;
    }

    public void setRace(DogsEnums race) {
        this.race = race;
    }

    public TypeAnimals getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(TypeAnimals typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public Double getWeightPet() {
        return weightPet;
    }

    public void setWeightPet(Double weightPet) {
        this.weightPet = weightPet;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public LocalDate getCastratedDate() {
        return castratedDate;
    }

    public void setCastratedDate(LocalDate castratedDate) {
        this.castratedDate = castratedDate;
    }

    public LifeAnimalsEnum getLifeAnimal() {
        return lifeAnimal;
    }

    public void setLifeAnimal(LifeAnimalsEnum lifeAnimal) {
        this.lifeAnimal = lifeAnimal;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}
