package com.capstone.HotelAdmin.DTOs;

public class ResponseHotelApproved {
    private Integer hotelId;
    private String hotelName;
    private String hotelContactNumber;
    private String owner;

    public ResponseHotelApproved(Integer hotelId, String hotelName, String hotelContactNumber, String owner) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelContactNumber = hotelContactNumber;
        this.owner = owner;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelContactNumber() {
        return hotelContactNumber;
    }

    public void setHotelContactNumber(String hotelContactNumber) {
        this.hotelContactNumber = hotelContactNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "ResponseHotelApproved{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", hotelContactNumber='" + hotelContactNumber + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
