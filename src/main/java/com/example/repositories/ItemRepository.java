package com.example.repositories;

import com.example.models.Item;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Integer>{

    List<Item> findByHotelId(int hotelId);
}
