package com.senhasfortes.geradordesenhas.services;

import java.security.SecureRandom;

import org.springframework.stereotype.Service;

@Service
public class GeradorDeSenhasService {

     public String generateRandomPassword(int len)
    {
        
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%¨&*-=+";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        String password = sb.toString(); 

        return password;
    }
}
