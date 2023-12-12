package com.exam.userms.controller.impl;

import com.exam.userms.controller.BaseController;
import com.exam.userms.entity.User;
import com.exam.userms.model.UserDTO;
import com.exam.userms.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/user")
@CrossOrigin(origins = "http://localhost:8080")//Spring security
public class UserControllerImpl implements BaseController<User, UserDTO, Long> {
    private BaseService baseService;

    @Autowired
    public UserControllerImpl(BaseService baseService) {
        this.baseService = baseService;
    }

    @GetMapping
    @Override
    public ResponseEntity<Page<User>> getAllUsers(@RequestParam(name = "page", defaultValue = "0") Integer page,
                                                  @RequestParam(name = "size", defaultValue = "6") Integer size) {
      Page<User> userPage = baseService.getAllUsersService(page - 1,size);
        return new ResponseEntity<>(userPage, HttpStatus.OK);
    }


    @Override
    public ResponseEntity<UserDTO> getByUserId(@PathVariable Long userId) {
        return null;
    }

    @PostMapping("/create")
    @Override
    public ResponseEntity<UserDTO> createNewUser(@RequestBody UserDTO newUser) {
        UserDTO userDTO = baseService.createNewUserService(newUser);
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    @Override
    public ResponseEntity<UserDTO> putUpdateUser(@RequestBody UserDTO user) {
        UserDTO userDTO = baseService.updateUser(user);
        return new ResponseEntity<>(userDTO,HttpStatus.OK);
    }
}
