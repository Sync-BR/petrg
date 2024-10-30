package com.meuspets.petlove.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @OneToOne(mappedBy = "login", cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @JsonManagedReference
    private UsuarioModel usuario;
    public LoginModel() {

    }

    public LoginModel(UsuarioModel user) {
        this.username = user.getLogin().getUsername();
        this.password = user.getLogin().getPassword();
    }


    @Override
    public String toString() {
        return "LoginModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", usuario=" + usuario +
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
