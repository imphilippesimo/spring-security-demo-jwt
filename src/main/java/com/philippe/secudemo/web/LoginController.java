package com.philippe.secudemo.web;

import com.philippe.secudemo.AppUser;
import com.philippe.secudemo.web.security.JwtConfig;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class LoginController {


    //Customize task after authentification
//    @PostMapping(value = "/auth")
//    public String signin(@RequestBody AppUser data) {
//        return "Login successful";
//
//    }

    @GetMapping("/public")
    public String publicEndPoint() {
        return "you are free to do whatever you want here";


    }

    @GetMapping("/user")
    public String AppEndpoint() {
        return "you are here because you logged in";


    }


    // -------- Admin Area --------
    // This method should only be accessed by users with role of 'admin'
    // We'll add the logic of role based auth later
    @GetMapping("/admin")
    public String homeAdmin() {
        return "This is the admin area, congratulations ";
    }
}
