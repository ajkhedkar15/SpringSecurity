package com.example.SpringSecurityLDAP.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rest/hello")
public class HelloResource {

    @GetMapping("/secured")
    public String getSecuredHello(){
        return "Secured Hello";
    }
}
