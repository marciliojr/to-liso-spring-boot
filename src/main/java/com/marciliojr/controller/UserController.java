package com.marciliojr.controller;


import com.marciliojr.model.User;
import com.marciliojr.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path="/user")
@Data
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/{nick}")
    public Optional<User> getUserForNick(String nick) {
        return userService.findUserByNick(nick);
    }
}