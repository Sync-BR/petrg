package com.meuspets.petlove.service;

import com.meuspets.petlove.handling.EncryptionHanding;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionService {
    private MessageDigest digest = null;

    private EncryptionService() throws EncryptionHanding {
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new EncryptionHanding("MD5 não suportado!");
        }
    }

    //Generate keys
    private char[] hexCodes(byte[] password) {
        char[] hexChars = new char[password.length * 2];
        String hexString;
        for (int index = 0; index < password.length; index++) {
            hexString = Integer.toHexString(password[index]);
            hexString.toUpperCase().getChars(hexString.length() - 2, hexString.length(), hexChars, index * 2);
        }
        return new String(hexChars).toCharArray();
    }

    //Encrypt text
    public String encrypt(String password) throws EncryptionHanding {
        if (digest != null) {
            return new String(hexCodes(digest.digest(password.getBytes())));
        }
        throw new EncryptionHanding("Senha não pode ser nullo");
    }

}
