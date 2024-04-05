package com.capstone.HotelAdmin.Services;

import com.capstone.HotelAdmin.DTOs.ResponseHotelAwait;
import com.capstone.HotelAdmin.DTOs.ResponseRoomAwait;
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

    public ResponseHotelAwait DetailHotelService(Integer hotelId){
        ResponseHotelAwait listAwaitHotel = getApproveRepository.getDetailHotel(hotelId);
        List<ResponseRoomAwait> listRoom = getApproveRepository.getRoomList(hotelId);
        List<String> listHotelImages = getApproveRepository.getHotelImages(hotelId);
        List<String> listRoomImages = getApproveRepository.getRoomImages(hotelId);
        Users userInfo = getApproveRepository.getUser(hotelId);

        for(ResponseRoomAwait data: listRoom){
            List<String> listFacilities = getApproveRepository.getRoomFacilities(data.getRoom_id());
            data.setRoom_facilities(listFacilities);
        }

        listAwaitHotel.setRooms(listRoom);
        listAwaitHotel.setHotel_images(listHotelImages);
        listAwaitHotel.setRoom_images(listRoomImages);
        listAwaitHotel.setUser(userInfo);

        return listAwaitHotel;
    }
}
