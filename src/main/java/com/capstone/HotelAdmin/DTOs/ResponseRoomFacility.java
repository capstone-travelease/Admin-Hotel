package com.capstone.HotelAdmin.DTOs;

public class ResponseRoomFacility {
    private Integer facility_id;
    private String facility_name;
    private String facility_images;

    public ResponseRoomFacility(Integer facility_id, String facility_name, String facility_images) {
        this.facility_id = facility_id;
        this.facility_name = facility_name;
        this.facility_images = facility_images;
    }

    public Integer getFacility_id() {
        return facility_id;
    }

    public void setFacility_id(Integer facility_id) {
        this.facility_id = facility_id;
    }

    public String getFacility_name() {
        return facility_name;
    }

    public void setFacility_name(String facility_name) {
        this.facility_name = facility_name;
    }

    public String getFacility_images() {
        return facility_images;
    }

    public void setFacility_images(String facility_images) {
        this.facility_images = facility_images;
    }

    @Override
    public String toString() {
        return "ResponseRoomFacility{" +
                "facility_id=" + facility_id +
                ", facility_name='" + facility_name + '\'' +
                ", facility_images='" + facility_images + '\'' +
                '}';
    }
}
