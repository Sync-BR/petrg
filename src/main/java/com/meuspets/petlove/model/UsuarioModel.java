package com.meuspets.petlove.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity(name = "Usuarios")
@Table(name =  "usuarios",schema = "petrg")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = true)
    private String surname;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "cpf", nullable = false)
    private String cpf;
    @Column(name = "telephone", nullable = false)
    private String telephone;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Column(name = "date", nullable = false)
    private LocalDate datOfBirth;
    // Other variables //
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "login_id", referencedColumnName = "id")
    @JsonBackReference
    private LoginModel login;


    public UsuarioModel() {
    }


    @Override
    public String toString() {
        return "UsuarioModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telephone='" + telephone + '\'' +
                ", datOfBirth=" + datOfBirth +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDate getDatOfBirth() {
        return datOfBirth;
    }

    public void setDatOfBirth(LocalDate datOfBirth) {
        this.datOfBirth = datOfBirth;
    }

    public LoginModel getLogin() {
        return login;
    }

    public void setLogin(LoginModel login) {
        this.login = login;
    }


}
