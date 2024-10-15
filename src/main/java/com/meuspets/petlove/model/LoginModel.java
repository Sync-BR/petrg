package com.meuspets.petlove.model;

import jakarta.persistence.*;

@Entity(name = "loginModel")
@Table(name = "logins")
public class LoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username",nullable = false)
    private String username;
    @Column( name = "password",nullable = false)
    private String password;
    @OneToOne(mappedBy = "login")
    private UsuarioModel usuario;
    public LoginModel() {

    }

    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
