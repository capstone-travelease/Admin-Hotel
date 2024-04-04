package com.capstone.HotelAdmin.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Users {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phone;

    @Column(name = "full_name")
    private String full_name;

//    @Column(name = "gender")
//    private boolean gender;
//
//    @Column(name = "password")
//    private String password;
//
//    @Column(name = "dob")
//    private LocalDate birthday;
//
//    @Column(name = "avatar")
//    private String avatar;
//
//    @Column(name = "role_id")
//    private int role;

    public Users(Integer id, String email, String phone, String full_name) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.full_name = full_name;
    }

//    public Users(Integer id, String email, String phone, String full_name, boolean gender, String password, LocalDate birthday, String avatar, int role) {
//        this.id = id;
//        this.email = email;
//        this.phone = phone;
//        this.full_name = full_name;
//        this.gender = gender;
//        this.password = password;
//        this.birthday = birthday;
//        this.avatar = avatar;
//        this.role = role;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getfull_name() {
        return full_name;
    }

    public void setfull_name(String full_name) {
        this.full_name = full_name;
    }

//    public boolean isGender() {
//        return gender;
//    }
//
//    public void setGender(boolean gender) {
//        this.gender = gender;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public LocalDate getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(LocalDate birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getAvatar() {
//        return avatar;
//    }
//
//    public void setAvatar(String avatar) {
//        this.avatar = avatar;
//    }
//
//    public int getRole() {
//        return role;
//    }
//
//    public void setRole(int role) {
//        this.role = role;
//    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", full_name='" + full_name + '\'' +
                '}';
    }
}
