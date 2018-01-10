package com.example.controllers;

import com.example.models.Hotel;
import com.example.models.Item;
import com.example.services.HotelService;
import com.example.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;
    @Autowired
    private ItemService itemService;

    @RequestMapping("")
    public String hotelHome() {
        return "Hotel Home working!!";
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }

    @RequestMapping(value="/{hotelId}", method=RequestMethod.GET)
    public Hotel getHotel(@PathVariable int hotelId) {
        return hotelService.getHotel(hotelId);
    }

    @RequestMapping(value="/{hotelId}/items", method=RequestMethod.GET)
    public List<Item> getAllHotelItems(@PathVariable int hotelId) {
        return itemService.getAllHotelItems(hotelId);
    }

    @RequestMapping(value="/all", method=RequestMethod.GET)
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }
}
