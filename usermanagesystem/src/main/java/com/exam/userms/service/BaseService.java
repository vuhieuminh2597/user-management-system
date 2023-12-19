package com.exam.userms.service;

import com.exam.userms.entity.User;
import com.exam.userms.model.UserDTO;
import com.exam.userms.model.UserPage;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BaseService {
    UserPage getAllUsersService(Integer page, Integer size);

    UserDTO createNewUserService(UserDTO newUser);

    UserDTO updateUser(UserDTO user);
}
