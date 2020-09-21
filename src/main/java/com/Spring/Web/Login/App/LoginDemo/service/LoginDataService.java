package com.Spring.Web.Login.App.LoginDemo.service;

import com.Spring.Web.Login.App.LoginDemo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.stream.Collectors;

@Repository
public class LoginDataService {
    @Autowired
    LoginRepository repository;

    public String retrieveUserID(){
        return repository.findAll().stream().filter(users->
                users.getUserID().equals("snigda05")).collect(Collectors.toList()).get(0).getUserID();
    }
    public String retrievePassword(){
        return repository.findAll().stream().filter(users->
                users.getUserID().equals("snigda05")).collect(Collectors.toList()).get(0).getPassword();
    }
    public String retrieveRole(){
        return repository.findAll().stream().filter(users->
                users.getUserID().equals("snigda05")).collect(Collectors.toList()).get(0).getRole();
    }
}
