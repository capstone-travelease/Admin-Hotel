package com.capstone.HotelAdmin.DTOs;

public class ResponseHotelFacility {
//    private Integer facility_id;
    private String facility_name;
//    private Integer hotel_id;
    private String facility_image;

    public ResponseHotelFacility() {
    }

    public ResponseHotelFacility(String facility_name, String facility_image) {
        this.facility_name = facility_name;
        this.facility_image = facility_image;
    }
//
//    public ResponseHotelFacility(Integer facility_id, String facility_name) {
//        this.facility_id = facility_id;
//        this.facility_name = facility_name;
//    }
//    public ResponseHotelFacility(Integer facility_id, String facility_name, Integer hotel_id) {
//        this.facility_id = facility_id;
//        this.facility_name = facility_name;
//        this.hotel_id = hotel_id;
//    }
//
//    public ResponseHotelFacility(Integer facility_id, String facility_name, Integer hotel_id, String facility_image) {
//        this.facility_id = facility_id;
//        this.facility_name = facility_name;
//        this.hotel_id = hotel_id;
//        this.facility_image = facility_image;
//    }

//    public Integer getFacility_id() {
//        return facility_id;
//    }
//
//    public void setFacility_id(Integer facility_id) {
//        this.facility_id = facility_id;
//    }

    public String getFacility_name() {
        return facility_name;
    }

    public void setFacility_name(String facility_name) {
        this.facility_name = facility_name;
    }

//    public Integer gethotel_id() {
//        return hotel_id;
//    }
//
//    public void sethotel_id(Integer hotel_id) {
//        this.hotel_id = hotel_id;
//    }

    public String getFacility_image() {
        return facility_image;
    }

    public void setFacility_image(String facility_image) {
        this.facility_image = facility_image;
    }

    @Override
    public String toString() {
        return "ResponseHotelFacility{" +
                "facility_name='" + facility_name + '\'' +
                ", facility_image='" + facility_image + '\'' +
                '}';
    }
}
