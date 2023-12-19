package com.exam.userms.controller;

import com.exam.userms.model.UserPage;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseController <T,V,ID>{
    ResponseEntity<UserPage> getAllUsers(Integer page, Integer size);
    ResponseEntity<V> getByUserId(ID userId);
    ResponseEntity<V> createNewUser(V newUser);
    ResponseEntity<V> putUpdateUser(V user);
}
