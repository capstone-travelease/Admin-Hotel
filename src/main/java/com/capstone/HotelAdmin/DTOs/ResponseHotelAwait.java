package com.capstone.HotelAdmin.DTOs;

import com.capstone.HotelAdmin.Entities.Facilities;
import com.capstone.HotelAdmin.Entities.Users;

import java.sql.Time;
import java.util.List;

public class ResponseHotelAwait {
    private Integer hotel_id;
    private String hotel_name;
    private  String hotel_address;
    private List<ResponseRoomAwait> rooms;
    private Time check_in;
    private Time check_out;
    private String description;
    private List<String> hotel_images;
    private List<String> room_images;
    private Users user;
    private Facilities id_card;
    private String policy;

    public ResponseHotelAwait(Integer hotel_id, String hotel_name, String hotel_address, Time check_in, Time check_out, String description) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
    }

    public ResponseHotelAwait(Integer hotel_id, String hotel_name, String hotel_address, Time check_in, Time check_out, String description, String policy) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.policy = policy;
    }

    public ResponseHotelAwait(Integer hotel_id, String hotel_name, String hotel_address, List<ResponseRoomAwait> rooms, Time check_in, Time check_out, String description, String policy) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.rooms = rooms;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.policy = policy;
    }

    public ResponseHotelAwait(Integer hotel_id, String hotel_name, String hotel_address, List<ResponseRoomAwait> rooms, Time check_in, Time check_out, String description, List<String> hotel_images, String policy) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.rooms = rooms;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.hotel_images = hotel_images;
        this.policy = policy;
    }

    public ResponseHotelAwait(Integer hotel_id, String hotel_name, String hotel_address, List<ResponseRoomAwait> rooms, Time check_in, Time check_out, String description, List<String> hotel_images, List<String> room_images, String policy) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.rooms = rooms;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.hotel_images = hotel_images;
        this.room_images = room_images;
        this.policy = policy;
    }

    public ResponseHotelAwait(Integer hotel_id, String hotel_name, String hotel_address, List<ResponseRoomAwait> rooms, Time check_in, Time check_out, String description, List<String> hotel_images, List<String> room_images, Users user, String policy) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.rooms = rooms;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.hotel_images = hotel_images;
        this.room_images = room_images;
        this.user = user;
        this.policy = policy;
    }


    public ResponseHotelAwait(Integer hotel_id, String hotel_name, String hotel_address, List<ResponseRoomAwait> rooms, Time check_in, Time check_out, String description, List<String> hotel_images, List<String> room_images, Users user, Facilities id_card, String policy) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.rooms = rooms;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.hotel_images = hotel_images;
        this.room_images = room_images;
        this.user = user;
        this.id_card = id_card;
        this.policy = policy;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_address() {
        return hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }

    public List<ResponseRoomAwait> getRooms() {
        return rooms;
    }

    public void setRooms(List<ResponseRoomAwait> rooms) {
        this.rooms = rooms;
    }

    public Time getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Time check_in) {
        this.check_in = check_in;
    }

    public Time getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Time check_out) {
        this.check_out = check_out;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getHotel_images() {
        return hotel_images;
    }

    public void setHotel_images(List<String> hotel_images) {
        this.hotel_images = hotel_images;
    }

    public List<String> getRoom_images() {
        return room_images;
    }

    public void setRoom_images(List<String> room_images) {
        this.room_images = room_images;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Facilities getId_card() {
        return id_card;
    }

    public void setId_card(Facilities id_card) {
        this.id_card = id_card;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    @Override
    public String toString() {
        return "ResponseHotel{" +
                "hotel_id=" + hotel_id +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_address='" + hotel_address + '\'' +
                ", rooms=" + rooms +
                ", check_in='" + check_in + '\'' +
                ", check_out='" + check_out + '\'' +
                ", description='" + description + '\'' +
                ", hotel_images=" + hotel_images +
                ", room_images=" + room_images +
                ", user=" + user +
                ", id_card=" + id_card +
                ", policy='" + policy + '\'' +
                '}';
    }
}
