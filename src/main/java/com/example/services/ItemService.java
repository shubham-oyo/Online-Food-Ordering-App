package com.example.services;

import com.example.models.Item;
import com.example.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Item getItem(int id) {
        return itemRepository.findOne(id);
    }

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }

    // Get items of a particular hotel
    public List<Item> getAllHotelItems(int hotelId) {
        return itemRepository.findA
    }
}
