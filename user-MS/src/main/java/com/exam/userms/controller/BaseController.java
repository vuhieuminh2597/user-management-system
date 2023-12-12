package com.exam.userms.controller;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseController <T,V,ID>{
    ResponseEntity<Page<T>> getAllUsers(Integer page,Integer size);
    ResponseEntity<V> getByUserId(ID userId);
    ResponseEntity<V> createNewUser(V newUser);
    ResponseEntity<V> putUpdateUser(V user);
}
