package com.capstone.HotelAdmin.Services;

import com.capstone.HotelAdmin.DTOs.ResponseHotelDetail;
import com.capstone.HotelAdmin.DTOs.ResponseHotelFacility;
import com.capstone.HotelAdmin.DTOs.ResponseRoomAwait;
import com.capstone.HotelAdmin.DTOs.ResponseRoomFacility;
import com.capstone.HotelAdmin.Entities.Users;
import com.capstone.HotelAdmin.Repositories.ApproveHotelRepository;
import com.capstone.HotelAdmin.Repositories.GetApproveRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApproveService {

    private final GetApproveRepository getApproveRepository;

    private final ApproveHotelRepository approveHotel;

    @Autowired
    public ApproveService(GetApproveRepository approveRepository, ApproveHotelRepository approveHotel) {
        this.getApproveRepository = approveRepository;
        this.approveHotel = approveHotel;
    }

    @Transactional
    public Integer ApproveHotelService(Integer hotelId){
        return approveHotel.AcceptApproval(hotelId);
    }

    @Transactional
    public Integer RejectHotelService(Integer hotelId){
        return approveHotel.RejectApproval(hotelId);
    }

    public ResponseHotelDetail DetailHotelService(Integer hotelId){
        ResponseHotelDetail detailHotel = getApproveRepository.getDetailHotel(hotelId);
        List<ResponseRoomAwait> listRoom = getApproveRepository.getRoomList(hotelId);
        List<String> listHotelImages = getApproveRepository.getHotelImages(hotelId);
        List<ResponseHotelFacility> listHotelFacility = getApproveRepository.getHotelFacilities(hotelId);
        Users userInfo = getApproveRepository.getUser(hotelId);

        for(ResponseRoomAwait data: listRoom){
            List<ResponseRoomFacility> listFacilities = getApproveRepository.getRoomFacilities(data.getRoom_id());
            List<String> listImage = getApproveRepository.getRoomImages(data.getRoom_id());
            data.setRoom_images(listImage);
            data.setRoom_facilities(listFacilities);
        }

        detailHotel.setRooms(listRoom);
        detailHotel.setHotel_images(listHotelImages);
        detailHotel.setHotel_facilities(listHotelFacility);
        detailHotel.setUser(userInfo);

        return detailHotel;
    }
}
