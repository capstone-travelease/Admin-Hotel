package com.capstone.HotelAdmin.Services;

import com.capstone.HotelAdmin.DTOs.ResponseHotelAwait;
import com.capstone.HotelAdmin.DTOs.ResponseRoomAwait;
import com.capstone.HotelAdmin.Entities.Users;
import com.capstone.HotelAdmin.Repositories.GetApproveRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApproveService {

    private final GetApproveRepository approveRepository;

    @Autowired
    public ApproveService(GetApproveRepository approveRepository) {
        this.approveRepository = approveRepository;
    }

//    public void AwaitHotelList(){
//
//    }

    public ResponseHotelAwait DetailHotel(Integer hotelId){
        ResponseHotelAwait listAwaitHotel = approveRepository.getDetailHotel(hotelId);
        List<ResponseRoomAwait> listRoom = approveRepository.getRoomList(hotelId);
        List<String> listHotelImages = approveRepository.getHotelImages(hotelId);
        List<String> listRoomImages = approveRepository.getRoomImages(hotelId);
        Users userInfo = approveRepository.getUser(hotelId);

        for(ResponseRoomAwait data: listRoom){
            List<String> listFacilities = approveRepository.getRoomFacilities(data.getRoom_id());
            data.setRoom_facilities(listFacilities);
        }

        listAwaitHotel.setRooms(listRoom);
        listAwaitHotel.setHotel_images(listHotelImages);
        listAwaitHotel.setRoom_images(listRoomImages);
        listAwaitHotel.setUser(userInfo);

        return listAwaitHotel;
    }
}
