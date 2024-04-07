package com.capstone.HotelAdmin.DTOs;

import com.capstone.HotelAdmin.Entities.Facilities;
import com.capstone.HotelAdmin.Entities.HotelFacilities;
import com.capstone.HotelAdmin.Entities.Users;

import java.sql.Time;
import java.util.List;

public class ResponseHotelDetail {
    private Integer hotel_id;
    private String hotel_name;
    private String hotel_address;
    private String hotel_contact_number;
    private Time check_in;
    private Time check_out;
    private String description;
    private List<String> hotel_images;
    private List<ResponseHotelFacility> hotel_facilities;
    private String policy;
    private List<ResponseRoomAwait> rooms;
    private Users user;
    private String id_card;

    public ResponseHotelDetail(Integer hotel_id, String hotel_name, String hotel_address, String hotel_contact_number, Time check_in, Time check_out, String description) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.hotel_contact_number = hotel_contact_number;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
    }

    public ResponseHotelDetail(Integer hotel_id, String hotel_name, String hotel_address, String hotel_contact_number, Time check_in, Time check_out, String description, String policy) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.hotel_contact_number = hotel_contact_number;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.policy = policy;
    }

    public ResponseHotelDetail(Integer hotel_id, String hotel_name, String hotel_address, String hotel_contact_number, List<ResponseRoomAwait> rooms, Time check_in, Time check_out, String description, String policy) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.hotel_contact_number = hotel_contact_number;
        this.rooms = rooms;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.policy = policy;
    }

    public ResponseHotelDetail(Integer hotel_id, String hotel_name, String hotel_address, String hotel_contact_number, List<ResponseRoomAwait> rooms, Time check_in, Time check_out, String description, List<String> hotel_images, String policy) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.hotel_contact_number = hotel_contact_number;
        this.rooms = rooms;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.hotel_images = hotel_images;
        this.policy = policy;
    }

    public ResponseHotelDetail(Integer hotel_id, String hotel_name, String hotel_address, String hotel_contact_number, Time check_in, Time check_out, String description, List<String> hotel_images, List<ResponseHotelFacility> hotel_facilities, String policy, List<ResponseRoomAwait> rooms) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.hotel_contact_number = hotel_contact_number;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.hotel_images = hotel_images;
        this.hotel_facilities = hotel_facilities;
        this.policy = policy;
        this.rooms = rooms;
    }

    public ResponseHotelDetail(Integer hotel_id, String hotel_name, String hotel_address, String hotel_contact_number, Time check_in, Time check_out, String description, List<String> hotel_images, List<ResponseHotelFacility> hotel_facilities, String policy, List<ResponseRoomAwait> rooms, Users user) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.hotel_contact_number = hotel_contact_number;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.hotel_images = hotel_images;
        this.hotel_facilities = hotel_facilities;
        this.policy = policy;
        this.rooms = rooms;
        this.user = user;
    }

    public ResponseHotelDetail(Integer hotel_id, String hotel_name, String hotel_address, String hotel_contact_number, Time check_in, Time check_out, String description, List<String> hotel_images, List<ResponseHotelFacility> hotel_facilities, String policy, List<ResponseRoomAwait> rooms, Users user, String id_card) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.hotel_contact_number = hotel_contact_number;
        this.check_in = check_in;
        this.check_out = check_out;
        this.description = description;
        this.hotel_images = hotel_images;
        this.hotel_facilities = hotel_facilities;
        this.policy = policy;
        this.rooms = rooms;
        this.user = user;
        this.id_card = id_card;
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

    public String getHotel_contact_number() {
        return hotel_contact_number;
    }

    public void setHotel_contact_number(String hotel_contact_number) {
        this.hotel_contact_number = hotel_contact_number;
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

    public List<ResponseHotelFacility> getHotel_facilities() {
        return hotel_facilities;
    }

    public void setHotel_facilities(List<ResponseHotelFacility> hotel_facilities) {
        this.hotel_facilities = hotel_facilities;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public List<ResponseRoomAwait> getRooms() {
        return rooms;
    }

    public void setRooms(List<ResponseRoomAwait> rooms) {
        this.rooms = rooms;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    @Override
    public String toString() {
        return "ResponseHotelDetail{" +
                "hotel_id=" + hotel_id +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_address='" + hotel_address + '\'' +
                ", hotel_contact_number='" + hotel_contact_number + '\'' +
                ", check_in=" + check_in +
                ", check_out=" + check_out +
                ", description='" + description + '\'' +
                ", hotel_images=" + hotel_images +
                ", hotel_facilities=" + hotel_facilities +
                ", policy='" + policy + '\'' +
                ", rooms=" + rooms +
                ", user=" + user +
                ", id_card='" + id_card + '\'' +
                '}';
    }
}
