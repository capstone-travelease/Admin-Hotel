package com.capstone.HotelAdmin.DTOs;

import java.util.List;

public class ResponseHotelAwait {
    private Integer hotel_id;
    private String hotel_name;
    private String hotel_email;
    private String hotel_address;
    private String hotel_contact_number;
    private List<String> hotel_images;
    private String status;

    public ResponseHotelAwait(Integer hotel_id, String hotel_name, String hotel_email, String hotel_address, String hotel_contact_number, String status) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_email = hotel_email;
        this.hotel_address = hotel_address;
        this.hotel_contact_number = hotel_contact_number;
        this.status = status;
    }

    public ResponseHotelAwait(Integer hotel_id, String hotel_name, String hotel_email, String hotel_address, String hotel_contact_number, List<String> hotel_images, String status) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_email = hotel_email;
        this.hotel_address = hotel_address;
        this.hotel_contact_number = hotel_contact_number;
        this.hotel_images = hotel_images;
        this.status = status;
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

    public String getHotel_email() {
        return hotel_email;
    }

    public void setHotel_email(String hotel_email) {
        this.hotel_email = hotel_email;
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

    public List<String> getHotel_images() {
        return hotel_images;
    }

    public void setHotel_images(List<String> hotel_images) {
        this.hotel_images = hotel_images;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResponseHotelAwait{" +
                "hotel_id=" + hotel_id +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_email='" + hotel_email + '\'' +
                ", hotel_address='" + hotel_address + '\'' +
                ", hotel_contact_number='" + hotel_contact_number + '\'' +
                ", hotel_images=" + hotel_images +
                ", status='" + status + '\'' +
                '}';
    }
}
