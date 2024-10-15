package com.meuspets.petlove.repository;

import com.meuspets.petlove.model.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository <LoginModel, Long>{
    LoginModel findByUsername(String username);
}
