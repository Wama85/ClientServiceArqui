package com.example.examen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void createUser() {
        //arrange
        UserService userService = new UserService();
        //act
        userService.createUser(new User("juan","1234","perez","fernandez"));
        //assert
        assertEquals(userService.getUsers().size(), 1);
    }
}