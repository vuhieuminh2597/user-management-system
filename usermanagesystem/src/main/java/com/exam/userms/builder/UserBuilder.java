package com.exam.userms.builder;

import com.exam.userms.entity.User;

public class UserBuilder {
    private User user = new User();

    public UserBuilder setIdUser(Long id) {
        this.user.setId(id);
        return this;
    }

    public UserBuilder setNameUser(String nameUser) {
        this.user.setName(nameUser);
        return this;
    }

    public UserBuilder setEmailUser(String emailUser) {
        this.user.setEmail(emailUser);
        return this;
    }

    public UserBuilder setAddressUser(String addressUser) {
        this.user.setAddress(addressUser);
        return this;
    }

    public UserBuilder setPasswordUser(String passwordUser) {
        this.user.setPassWord(passwordUser);
        return this;
    }

    public UserBuilder setPhoneUser(String phoneUser) {
        this.user.setPhone(phoneUser);
        return this;
    }

    public UserBuilder setGenderUser(String genderUser) {
        this.user.setGender(genderUser);
        return this;
    }
    public UserBuilder setBirthDayUser(String birthDayUser) {
        this.user.setBirthDay(birthDayUser);
        return this;
    }

    public User build() {
        return this.user;
    }
}
