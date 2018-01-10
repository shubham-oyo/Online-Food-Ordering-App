package com.example.controllers;

import com.example.models.Hotel;
import com.example.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @RequestMapping("/")
    public String hotelHome() {
        return "Hotel Home working!!";
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }

    @RequestMapping(value="/{hotelId}", method=RequestMethod.GET)
    public Hotel getHotel(@RequestBody int hotelId) {
        return hotelService.getHotel(hotelId);
    }
}
