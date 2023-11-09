package com.technikum.passwordgenerator;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordGenerator {

    @GetMapping("/password")
    public String generateSecurePassword(){
        return RandomStringUtils.random(64, true, true);
    }

}
