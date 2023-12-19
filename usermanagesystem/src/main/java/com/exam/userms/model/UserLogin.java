package com.exam.userms.model;

import java.util.Objects;

public class UserLogin {
    private String id;
    private String email;
    private String passWord;

    public UserLogin(String id, String email, String passWord) {
        this.id = id;
        this.email = email;
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLogin userLogin = (UserLogin) o;
        return Objects.equals(id, userLogin.id) && Objects.equals(email, userLogin.email) && Objects.equals(passWord, userLogin.passWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, passWord);
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
