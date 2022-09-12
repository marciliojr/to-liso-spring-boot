package com.marciliojr.service;


import com.marciliojr.model.User;
import com.marciliojr.repository.UserDAO;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {

    private final UserDAO userDAO;

    public UserService(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public Optional<User> findUserByNick(String nick){
        return userDAO.findUserByNick(nick);
    }
}
