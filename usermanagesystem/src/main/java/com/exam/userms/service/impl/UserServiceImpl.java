package com.exam.userms.service.impl;

import com.exam.userms.builder.UserPageBuilder;
import com.exam.userms.entity.User;
import com.exam.userms.exception.ResourceNotFoundException;
import com.exam.userms.mapper.MapByUser;
import com.exam.userms.model.UserDTO;
import com.exam.userms.model.UserPage;
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
    public UserServiceImpl(UserRepository userRepository, MapByUser mapByUser) {
        this.userRepository = userRepository;
        this.mapByUser = mapByUser;
    }

    @Override
    public UserPage getAllUsersService(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<User> result = userRepository.findAllBy(pageable);
        return new UserPageBuilder()
                .setPage(page + 1)
                .setData(result.getContent())
                .setNext(page, size, result.getTotalElements())
                .setPrevious(page + 1, size, result.getTotalElements())
                .setSize(size)
                .setTotalPages(result.getTotalPages())
                .setTotalElement(result.getTotalElements())
                .build();
    }

    @Override
    public UserDTO createNewUserService(UserDTO newUser) {
        User userMap = mapByUser.mapToUser(newUser);
        User user = userRepository.save(userMap);
        return mapByUser.mapToUserDTO(user);
    }

    @Override
    public UserDTO updateUser(UserDTO user) {
        User userEntity = userRepository.findById(user.getId()).orElseThrow(() ->
                new ResourceNotFoundException("User was not found with given id: " + user.getId()));
        User userMap = mapByUser.mapToUser(user);
        userRepository.save(userMap);
        return mapByUser.mapToUserDTO(userMap);
    }

}
