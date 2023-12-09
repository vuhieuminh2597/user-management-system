package com.exam.userms.service;

import com.exam.userms.entity.User;

import java.util.List;

public interface BaseService {
    List<User> findAllUsers();
}
