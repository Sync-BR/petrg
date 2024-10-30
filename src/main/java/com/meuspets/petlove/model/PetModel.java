package com.meuspets.petlove.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.meuspets.petlove.model.Pet.VaccineModel;
import enums.CatBreedEnums;
import enums.DogsEnums;
import enums.LifeAnimalsEnum;
import enums.TypeAnimals;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "PetModel")
@Table(name = "pets", schema = "petrg")
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
    private String race;
    @Transient
    @Enumerated(EnumType.STRING) // ou EnumType.ORDINAL
    private DogsEnums dogRace;
    @Transient
    @Enumerated(EnumType.STRING) // ou EnumType.ORDINAL
    private CatBreedEnums catRace;
    @Column(name = "type_animal", nullable = false)
    @Enumerated(EnumType.STRING) // ou EnumType.ORDINAL
    private TypeAnimals typeAnimal;
    @Column(name = "weight_pet", nullable = false)
    private Double weightPet;
    @Column(name = "observation", nullable = true)
    private String observation;
    @Column(name = "photo", nullable = false)
    private String photo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Column(name = "castrated_date", nullable = true)
    private LocalDate castratedDate;
    @Column(name = "life_animal", nullable = true)
    private LifeAnimalsEnum lifeAnimal;


    public PetModel() {

    }


    public PetModel(LocalDate castratedDate, String photo, String observation, Double weightPet, TypeAnimals typeAnimal, CatBreedEnums catRace, DogsEnums dogRace, String race, int agePet, String namePet, int id_usuario) {
        this.castratedDate = castratedDate;
        this.photo = photo;
        this.observation = observation;
        this.weightPet = weightPet;
        this.typeAnimal = typeAnimal;
        this.catRace = catRace;
        this.dogRace = dogRace;
        this.race = race;
        this.agePet = agePet;
        this.namePet = namePet;
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "PetModel{" +
                "id=" + id +
                ", id_usuario=" + id_usuario +
                ", namePet='" + namePet + '\'' +
                ", agePet=" + agePet +
                ", race='" + race + '\'' +
                ", dogRace=" + dogRace +
                ", catRace=" + catRace +
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



    public DogsEnums getDogRace() {
        return dogRace;

    }

    public void setDogRace(DogsEnums dogRace) {
        this.race = dogRace.getRace();
        this.dogRace = dogRace;
    }

    public CatBreedEnums getCatRace() {
        return catRace;
    }

    public void setCatRace(CatBreedEnums catRace) {
        this.race = catRace.getRace();
        this.catRace = catRace;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
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
