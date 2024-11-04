package com.meuspets.petlove.service;

import com.meuspets.petlove.handling.UsuarioHanding;
import com.meuspets.petlove.model.LoginModel;
import com.meuspets.petlove.model.UsuarioModel;

public class UserService {
    //Check data to update
    public boolean checkDateToUpdate(UsuarioModel usuario) throws UsuarioHanding {
        if (usuario.getSurname() != null && usuario.getTelephone() != null)
            return true;
        throw new UsuarioHanding("Dados nullos");


    }

    /*
     *This function checks if all fields are null and handles the error.
     */
    public boolean check(LoginModel user) throws UsuarioHanding {
        if (checkNullUser(user)) {
            checkNullUserName(user.getUsername());
            checkNullPassword(user.getPassword());
            return false;
        } else if (!checkNullUser(user)) {
            throw new UsuarioHanding("O usuário e a senha não podem estar vazios.");
        }
        return true;

    }

    //Check if the login and password are null.
    public boolean checkNullUser(LoginModel user) throws UsuarioHanding {
        if (user.getUsername().isEmpty() && user.getPassword().isEmpty()) {
            return false;
        }
        return true;

    }

    //Check if the user is null.
    public boolean checkNullUserName(String user) throws UsuarioHanding {
        if (!user.isEmpty())
            return false;
        throw new UsuarioHanding("Usuario não pode ser nullo");
    }

    //Check if the password is null.
    public boolean checkNullPassword(String password) throws UsuarioHanding {
        if (!password.isEmpty())
            return false;
        throw new UsuarioHanding("Senha não pode está nullo");
    }


}
