package com.exam.userms.controller.impl;

import com.exam.userms.controller.BaseController;
import com.exam.userms.entity.User;
import com.exam.userms.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/user")
@CrossOrigin(origins = "http://localhost:8080")//Spring security
public class UserControllerImpl implements BaseController<User,Long> {
    private BaseService baseService;

    @Autowired
    public UserControllerImpl(BaseService baseService) {
        this.baseService = baseService;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = baseService.findAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
}
