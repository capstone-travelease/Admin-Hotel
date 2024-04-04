package com.capstone.HotelAdmin.Controllers;

import com.capstone.HotelAdmin.DTOs.ResponseHotelDetail;
import com.capstone.HotelAdmin.Services.ApproveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin/api")
public class ApproveController {
    private final ApproveService approveService;

    @Autowired
    public ApproveController(ApproveService approveService) {
        this.approveService = approveService;
    }

//    @GetMapping("/approval-hotel")
//     public void GetAwaitHotel(){
//        approveService.AwaitHotelList();
//     }

     @GetMapping("/approval-hotel/{hotelId}")
    public ResponseHotelDetail GetHotel(@PathVariable Integer hotelId){
        return new ResponseHotelDetail(
                200,
                approveService.DetailHotel(hotelId),
                "Successful"
        );
     }
}
