package com.exam.userms.controller;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseController <T,ID>{
    ResponseEntity<List<T>> getAllUsers();
}
