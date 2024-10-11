package com.meuspets.petlove.service;

import com.meuspets.petlove.handling.UsuarioHanding;
import com.meuspets.petlove.model.UsuarioModel;

public class UserService {

    public static void main(String[] args) throws UsuarioHanding {
        UserService service = new UserService();
        UsuarioModel user = new UsuarioModel("a", "a");
        service.check(user);
    }

    public boolean check(UsuarioModel user) throws UsuarioHanding {
        if (checkNullUser(user)) {
            checkNullUserName(user.getUsername());
            checkNullPassword(user.getPassword());
            return false;
        } else if (!checkNullUser(user)) {
            throw new UsuarioHanding("O usuário e a senha não podem estar vazios.");
        }
        return true;

    }


    //Check if user values are null
    //If null, return true
    public boolean checkNullUser(UsuarioModel user) throws UsuarioHanding {
        if (user.getUsername().isBlank() && user.getPassword().isBlank()) {
            return false;
        }
        return true;
        // throw new UsuarioHanding("O usuário e a senha não podem estar vazios.");

    }

    public boolean checkNullUserName(String user) throws UsuarioHanding {
        if (!user.isEmpty())
            return false;
        throw new UsuarioHanding("Usuario não pode ser nullo");
    }

    public boolean checkNullPassword(String password) throws UsuarioHanding {
        if (!password.isEmpty())
            return false;
        throw new UsuarioHanding("Senha não pode está nullo");
    }


}
