package com.example.services;

import com.example.models.Hotel;
import com.example.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public Hotel addHotel(Hotel hotel) {
        Hotel returnedHotel = hotelRepository.save(hotel);
        return returnedHotel;
    }

    public Hotel getHotel(int hotelId) {
        return hotelRepository.findOne(hotelId);
    }

    public List<Hotel> getAllHotels() {
        return (List<Hotel>) hotelRepository.findAll();
    }
}
