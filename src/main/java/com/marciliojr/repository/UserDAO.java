package com.marciliojr.repository;

import com.marciliojr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserDAO extends JpaRepository<User, UUID> {

    public Optional<User> findUserByNick(String nick);

}
