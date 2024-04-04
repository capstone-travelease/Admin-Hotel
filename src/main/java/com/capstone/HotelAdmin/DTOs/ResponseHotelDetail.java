package com.capstone.HotelAdmin.DTOs;

public class ResponseHotelDetail {
    private Integer code;
    private ResponseHotelAwait data;
    private String message;

    public ResponseHotelDetail(Integer code, ResponseHotelAwait data, String message) {
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

    public ResponseHotelAwait getData() {
        return data;
    }

    public void setData(ResponseHotelAwait data) {
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
