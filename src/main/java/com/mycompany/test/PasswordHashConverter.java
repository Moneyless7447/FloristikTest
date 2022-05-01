
package com.mycompany.test;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Name:            PasswordHashConverter
 * Aufgabe:         Wird nicht genutzt
 * Version:         1.0
 * Letzte Änderung: 01.05.2022
 * Realisierung     Sascha Nickel
 */
public class PasswordHashConverter implements Serializable {

    private static final Logger logger
            = Logger.getLogger(PasswordHashConverter.class.getName());

    /**
     * Erzeugt für ein jeweiliges Passwort einen Hashwert
     *
     * @param pwd
     * @return
     */
    public String getPwdHash(String pwd) {
        String hash = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA");
            byte[] digest = md.digest(pwd.getBytes());
            hash = byArrayToHex(digest);
        } catch (NoSuchAlgorithmException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        return hash;
    }

    private String byArrayToHex(byte[] digest) {
        /*
        jedes Byte (-128...127) von digest wird in eine 2-stellige Hex-Zahl
        umgewandelt.
         */
        StringBuilder sb = new StringBuilder(digest.length * 2);
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    /*
    Alternative mit "salt"
    https://stackoverflow.com/questions/33085493/how-to-hash-a-password-with-sha-512-in-java
    
    Comment: Not a good choice for password hashing!
    With a good GPU you can calculate about 4 Giga SHA512 per second, 
    that why one should switch to BCrypt, PBKDF2 or SCrypt.
    */
    /*
    public String get_SHA_512_SecurePassword(String passwordToHash, String salt){
    String generatedPassword = null;
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(salt.getBytes(StandardCharsets.UTF_8));
        byte[] bytes = md.digest(passwordToHash.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++){
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        generatedPassword = sb.toString();
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
    }
    return generatedPassword;
    }
     */
}
