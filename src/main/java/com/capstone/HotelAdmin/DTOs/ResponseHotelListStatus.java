package com.capstone.HotelAdmin.DTOs;

import java.util.List;

public class ResponseHotelListStatus {
    private Integer code;
    private List<ResponseHotelApproved> data;
    private String message;

    public ResponseHotelListStatus(Integer code, List<ResponseHotelApproved> data, String message) {
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

    public List<ResponseHotelApproved> getData() {
        return data;
    }

    public void setData(List<ResponseHotelApproved> data) {
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
        return "ResponseHotelListStatus{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
