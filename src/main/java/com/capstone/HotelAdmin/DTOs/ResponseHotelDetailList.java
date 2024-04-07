package com.capstone.HotelAdmin.DTOs;

public class ResponseHotelDetailList {
    private Integer code;
    private ResponseHotelDetail data;
    private String message;

    public ResponseHotelDetailList(Integer code, ResponseHotelDetail data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ResponseHotelDetail getData() {
        return data;
    }

    public void setData(ResponseHotelDetail data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseHotelDetail{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
