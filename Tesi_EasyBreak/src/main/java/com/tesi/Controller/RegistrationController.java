package com.tesi.Controller;

import com.tesi.Entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Reg")
public class RegistrationController {
    List<User> users= new ArrayList<>();
    @PostMapping
    public User saveUsers(@RequestBody User user){
        users.add(user);
        System.out.println(user);
       return  user;
    }




}
