package com.capstone.HotelAdmin.Repositories;

import com.capstone.HotelAdmin.Entities.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ApproveHotelRepository extends JpaRepository<Hotels, Long> {
    @Modifying
    @Query("UPDATE Hotels h SET h.approve_status = 1 WHERE h.hotel_id = ?1")
    Integer AcceptApproval(Integer hotelId);
//
//    @Query("")
//    void GetAwaitHotel();
//
    @Modifying
    @Query("UPDATE Hotels h SET h.approve_status = 3 WHERE h.hotel_id = ?1")
    Integer RejectApproval(Integer hotelId);
}
