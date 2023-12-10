package com.exam.userms.service.impl;

import com.exam.userms.entity.User;
import com.exam.userms.mapper.MapByUser;
import com.exam.userms.model.UserDTO;
import com.exam.userms.repository.UserRepository;
import com.exam.userms.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements BaseService {
    private UserRepository userRepository;
    private MapByUser mapByUser;
    @Autowired
    public UserServiceImpl(UserRepository userRepository,MapByUser mapByUser) {
        this.userRepository = userRepository;
        this.mapByUser = mapByUser;
    }

    @Override
    public List<User> getAllUsersService() {
        return userRepository.findAllUser();
    }

    @Override
    public UserDTO createNewUserService(UserDTO newUser) {
        User userMap = mapByUser.mapToUser(newUser);
        User user = userRepository.save(userMap);
        return mapByUser.mapToUserDTO(user);
    }

    @Override
    public Page<User> getAllUsersService(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo - 1,6);
        return userRepository.findAll(pageable);
    }
}
