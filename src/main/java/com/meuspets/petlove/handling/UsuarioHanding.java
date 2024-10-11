package com.meuspets.petlove.handling;

public class UsuarioHanding extends Exception {
    //Handling to avoid receiving null values
    public UsuarioHanding(String msg) {
        super(msg);
    }

}
