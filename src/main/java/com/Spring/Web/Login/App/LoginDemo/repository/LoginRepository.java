package com.Spring.Web.Login.App.LoginDemo.repository;

import com.Spring.Web.Login.App.LoginDemo.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LoginRepository extends JpaRepository<Login,String> {
}
