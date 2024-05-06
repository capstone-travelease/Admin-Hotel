package com.capstone.HotelAdmin.Repositories;

import com.capstone.HotelAdmin.DTOs.ResponseHotelAwait;
import com.capstone.HotelAdmin.Entities.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApproveHotelRepository extends JpaRepository<Hotels, Long> {
    @Modifying
    @Query("UPDATE Hotels h SET h.approve_status = 1 WHERE h.hotel_id = ?1")
    Integer AcceptApproval(Integer hotelId);

//    @Query("SELECT new com.capstone.HotelAdmin.DTOs.ResponseHotelAwait(h.hotel_id, h.hotel_name, h.hotel_email, h.hotel_address, h.hotel_contact_number, r.room_quantity, as.statusName) FROM Hotels h\n" +
//            "INNER JOIN Rooms r ON r.hotel_id = h.hotel_id\n" +
//            "INNER JOIN ApproveStatus as ON as.statusId = h.approve_status\n" +
//            "WHERE h.approve_status = 2")
    @Query("SELECT new com.capstone.HotelAdmin.DTOs.ResponseHotelAwait(h.hotel_id, h.hotel_name, h.hotel_email, h.hotel_address, h.hotel_contact_number, as.statusName) FROM Hotels h\n" +
            "INNER JOIN ApproveStatus as ON as.statusId = h.approve_status\n" +
            "WHERE h.approve_status = 2")
    List<ResponseHotelAwait> GetAwaitHotel();

//    @Query("SELECT atc.file_url FROM Attachment atc\n" +
//            "INNER JOIN HotelAttachment hatc ON atc.attachment_id = hatc.attachment_id\n" +
//            "INNER JOIN Hotels h ON h.hotel_id = hatc.hotel_id\n"+
//            "WHERE h.hotel_id = ?1")
//    List<String> getHotelImages(Integer hotelId);

    @Modifying
    @Query("UPDATE Hotels h SET h.approve_status = 3 WHERE h.hotel_id = ?1")
    Integer RejectApproval(Integer hotelId);
}
