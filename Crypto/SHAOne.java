package com.example.restservice;
 
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class SHAOne {
 
    /**
     * @param args
     * @throws NoSuchAlgorithmException 
     */

    static String sha1(String password) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(password.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
         
        return sb.toString();
    }
}