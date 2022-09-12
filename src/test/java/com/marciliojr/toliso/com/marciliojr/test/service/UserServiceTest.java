package com.marciliojr.toliso.com.marciliojr.test.service;


import com.marciliojr.model.User;
import com.marciliojr.repository.UserDAO;
import com.marciliojr.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test for the Services.")
public class UserServiceTest {

    @InjectMocks
    private UserService userServiceMock;

    @Mock
    private UserDAO userDAOMock;

    @Test
    void findUserByNick(){
        User userMock = User.builder().name("nameTest").nick("name").email("m@m.com").password("123").id(UUID.randomUUID()).build();
        when(userDAOMock.findUserByNick("nameTest")).thenReturn(Optional.of(userMock));
        Optional<User> returnedUser = userServiceMock.findUserByNick("nameTest");
        assertEquals(userMock, returnedUser.get());
    }

}
