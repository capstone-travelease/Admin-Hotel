package com.capstone.HotelAdmin.Repositories;

import com.capstone.HotelAdmin.DTOs.ResponseHotelAwait;
import com.capstone.HotelAdmin.DTOs.ResponseRoomAwait;
import com.capstone.HotelAdmin.Entities.Hotels;
import com.capstone.HotelAdmin.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GetApproveRepository extends JpaRepository<Hotels, Long> {
    @Query("SELECT new com.capstone.HotelAdmin.DTOs.ResponseHotelAwait(h.hotel_id, h.hotel_name, h.hotel_address, h.check_in_time, h.check_out_time, h.hotel_description) FROM Hotels h\n" +
            "WHERE h.hotel_id = ?1")
    ResponseHotelAwait getDetailHotel(Integer hotelId);

    @Query("SELECT new com.capstone.HotelAdmin.DTOs.ResponseRoomAwait(r.room_id, rt.room_type_name, r.room_quantity, r.room_price, r.room_status) FROM Rooms r\n" +
            "INNER JOIN Roomtype rt ON rt.room_type_id = r.room_type_id\n" +
            "INNER JOIN Hotels h ON r.hotel_id = h.hotel_id\n"+
            "WHERE h.hotel_id = ?1")
    List<ResponseRoomAwait> getRoomList(Integer hotelId);

    @Query("SELECT f.facility_image FROM Facilities f\n" +
            "INNER JOIN RoomFacilities rf ON f.facility_id = rf.facility_id\n" +
            "INNER JOIN Roomdetail rd ON rd.room_detail_id = rf.room_id\n"+
            "INNER JOIN Rooms r ON r.room_id = rd.room_id\n" +
            "WHERE r.room_id = ?1"
    )
    List<String> getRoomFacilities(Integer roomId);
    @Query("SELECT atc.file_url FROM Attachment atc\n" +
            "INNER JOIN HotelAttachment hatc ON atc.attachment_id = hatc.attachment_id\n" +
            "INNER JOIN Hotels h ON h.hotel_id = hatc.hotel_id\n"+
            "WHERE h.hotel_id = ?1")
    List<String> getHotelImages(Integer hotelId);

    @Query("SELECT atc.file_url FROM Attachment atc\n" +
            "INNER JOIN RoomAttachment ratc ON atc.attachment_id = ratc.attachmentId\n" +
            "INNER JOIN Rooms r ON r.room_id = ratc.room_id\n"+
            "INNER JOIN Hotels h ON h.hotel_id = r.hotel_id\n" +
            "WHERE h.hotel_id = ?1")
    List<String> getRoomImages(Integer hotelId);

    @Query("SELECT new com.capstone.HotelAdmin.Entities.Users(u.id, u.email, u.phone, u.full_name) FROM Users u\n"+
            "INNER JOIN Hotels h ON h.owner_id = u.id \n" +
            "WHERE h.hotel_id = ?1")
    Users getUser(Integer hotelId);
}
