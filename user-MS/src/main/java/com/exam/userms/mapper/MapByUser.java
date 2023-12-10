package com.exam.userms.mapper;

import com.exam.userms.builder.UserBuilder;
import com.exam.userms.entity.User;
import com.exam.userms.model.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class MapByUser {

    public User mapToUser(UserDTO userDTO) {
        return new UserBuilder()
                .setIdUser(userDTO.getId())
                .setEmailUser(userDTO.getEmail())
                .setAddressUser(userDTO.getAddress())
                .setNameUser(userDTO.getName())
                .setAddressUser(userDTO.getAddress())
                .setPhoneUser(userDTO.getPhone())
                .setGenderUser(userDTO.getGender())
                .setBirthDayUser(userDTO.getBirthDay())
                .build();
    }

    public UserDTO mapToUserDTO(User user) {
        return new UserDTO(user.getId(), user.getName(), user.getAddress(), user.getEmail(),
                user.getGender(), user.getPhone(), user.getBirthDay());
    }
}
