package com.marciliojr.controller;


import com.marciliojr.model.User;
import com.marciliojr.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path="/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/nick")
    public Optional<User> getUserByNick(@RequestParam(value = "nick") String nick) {
        return userService.findUserByNick(nick);
    }
}