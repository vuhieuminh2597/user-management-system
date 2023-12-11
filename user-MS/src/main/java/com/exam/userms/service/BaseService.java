package com.exam.userms.service;

import com.exam.userms.entity.User;
import com.exam.userms.model.UserDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BaseService {
    List<User> getAllUsersService();

    UserDTO createNewUserService(UserDTO newUser);

}
