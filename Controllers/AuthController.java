package com.example.restservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.security.NoSuchAlgorithmException;

class LoginFormBody {
    public String login;
    public String password;
}
@Controller
public class AuthController {

@PostMapping("/login")
	public ResponseEntity login(@RequestBody LoginFormBody loginform, @RequestParam String password)  
    {
        try {
            return ResponseEntity.ok(SHAOne.sha1(password));
         } 
         catch (NoSuchAlgorithmException e) { 
             return ResponseEntity.ok("ERROR"); 
            }
    }
}