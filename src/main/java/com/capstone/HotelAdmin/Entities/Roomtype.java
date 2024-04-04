package com.capstone.HotelAdmin.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Roomtype {
    @Id
    private Integer room_type_id;
    @Column(name = "room_type_name")
    private String room_type_name;
    @Column(name = "room_type_price")
    private String room_type_price;

    public Roomtype() {
    }

    public Roomtype(Integer room_type_id, String room_type_name, String room_type_price) {
        this.room_type_id = room_type_id;
        this.room_type_name = room_type_name;
        this.room_type_price = room_type_price;
    }

    public Integer getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(Integer room_type_id) {
        this.room_type_id = room_type_id;
    }

    public String getRoom_type_name() {
        return room_type_name;
    }

    public void setRoom_type_name(String room_type_name) {
        this.room_type_name = room_type_name;
    }

    public String getRoom_type_price() {
        return room_type_price;
    }

    public void setRoom_type_price(String room_type_price) {
        this.room_type_price = room_type_price;
    }
}
