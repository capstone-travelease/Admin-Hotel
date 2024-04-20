package com.capstone.HotelAdmin.Controllers;

import com.capstone.HotelAdmin.DTOs.ResponseHotelAwait;
import com.capstone.HotelAdmin.DTOs.ResponseHotelDetailList;
import com.capstone.HotelAdmin.DTOs.ResponseStatus;
import com.capstone.HotelAdmin.Services.ApproveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin/api")
public class ApproveController {
    private final ApproveService approveService;

    @Autowired
    public ApproveController(ApproveService approveService) {
        this.approveService = approveService;
    }

    @PostMapping("/approval-hotel/approve/{hotelId}")
     public ResponseStatus ApproveHotelController(@PathVariable Integer hotelId){
        Integer approveStatus = approveService.ApproveHotelService(hotelId);

        if (approveStatus == 1){
            return new ResponseStatus(
                    200,
                    "Approved Hotel "+hotelId+" Successful",
                    "Successful"
            );
        }
        else {
            return new ResponseStatus(
                    404,
                    "Not found hotel " + hotelId,
                    "Failure"
            );
        }
     }

//    @CrossOrigin("*")
    @PostMapping("/approval-hotel/reject/{hotelId}")
    public ResponseStatus RejectHotelController(@PathVariable Integer hotelId){
        Integer rejectStatus = approveService.RejectHotelService(hotelId);

        if (rejectStatus == 1){
            return new ResponseStatus(
                    200,
                    "Reject Hotel " +hotelId+" Successful",
                    "Successful"
            );
        }
        else {
            return new ResponseStatus(
                    404,
                    "Not found hotel " + hotelId,
                    "Failure"
            );
        }
    }

//    @CrossOrigin("*")
    @GetMapping("/approval-hotel/{hotelId}")
    public ResponseHotelDetailList GetHotelController(@PathVariable Integer hotelId){
        return new ResponseHotelDetailList(
                200,
                approveService.DetailHotelService(hotelId),
                "Successful"
        );
    }

//    @CrossOrigin("*")
    @GetMapping("/approval-hotels")
    public List<ResponseHotelAwait> ListHotelAwait(){
        return approveService.AwaitHotel();
    }
}
