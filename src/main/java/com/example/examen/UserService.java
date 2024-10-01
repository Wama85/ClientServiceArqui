package com.example.examen;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    static List<User> users=new ArrayList<>();

    public  void createUser(User user ){
                users.add(user);
    }
    public List<User> getUsers(){
        return users;
    }

}
