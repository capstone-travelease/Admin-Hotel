package com.capstone.HotelAdmin.DTOs;

import java.util.List;

public class ResponseRoomAwait {
    private Integer room_id;
    private String room_type_name;
    private Integer room_quantity;
    private Double room_price;
    private Integer room_status;
    private List<String> room_facilities;

    public ResponseRoomAwait(Integer room_id, String room_type_name, Integer room_quantity, Double room_price, Integer room_status) {
        this.room_id = room_id;
        this.room_type_name = room_type_name;
        this.room_quantity = room_quantity;
        this.room_price = room_price;
        this.room_status = room_status;
    }

    public ResponseRoomAwait(Integer room_id, String room_type_name, Integer room_quantity, Double room_price, Integer room_status, List<String> room_facilities) {
        this.room_id = room_id;
        this.room_type_name = room_type_name;
        this.room_quantity = room_quantity;
        this.room_price = room_price;
        this.room_status = room_status;
        this.room_facilities = room_facilities;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public String getroom_type_name() {
        return room_type_name;
    }

    public void setroom_type_name(String room_type_name) {
        this.room_type_name = room_type_name;
    }

    public Integer getRoom_quantity() {
        return room_quantity;
    }

    public void setRoom_quantity(Integer room_quantity) {
        this.room_quantity = room_quantity;
    }

    public Double getRoom_price() {
        return room_price;
    }

    public void setRoom_price(Double room_price) {
        this.room_price = room_price;
    }

    public Integer getRoom_status() {
        return room_status;
    }

    public void setRoom_status(Integer room_status) {
        this.room_status = room_status;
    }

    public List<String> getRoom_facilities() {
        return room_facilities;
    }

    public void setRoom_facilities(List<String> room_facilities) {
        this.room_facilities = room_facilities;
    }

    @Override
    public String toString() {
        return "ResponseRoomAwait{" +
                "room_id=" + room_id +
                ", room_type_name='" + room_type_name + '\'' +
                ", room_quantity='" + room_quantity + '\'' +
                ", room_price=" + room_price +
                ", room_status=" + room_status +
                ", room_facilities=" + room_facilities +
                '}';
    }
}
