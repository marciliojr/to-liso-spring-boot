package com.marciliojr.service;


import com.marciliojr.model.User;
import com.marciliojr.repository.UserDAO;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class UserService {

    private final UserDAO userDAO;

    public Optional<User> findUserByNick(String nick){
        return userDAO.findUserByNick(nick);
    }
}
