package com.example.controllers;

import com.example.models.Item;
import com.example.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @RequestMapping("")
    public String itemHome() {
        return "Item home working!!";
    }

    @RequestMapping(value="/{itemId}", method=RequestMethod.GET)
    public Item getItem(@PathVariable int itemId) {
        return itemService.getItem(itemId);
    }

    @RequestMapping(value="/all", method=RequestMethod.GET)
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @RequestMapping(value="delete/{itemId}", method=RequestMethod.DELETE)
    public String deleteItem(@PathVariable int itemId) {
        return itemService.deleteItem(itemId);
    }
}
