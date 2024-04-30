package com.example.Privateerv2.controller;


import com.example.Privateerv2.model.WatchlistItem;
import com.example.Privateerv2.repository.WatchlistItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wli")
public class WatchlistItemController {

    WatchlistItemRepository wlir;

    WatchlistItemController(WatchlistItemRepository watchlistItemRepository) {
        this.wlir = watchlistItemRepository;
    }

    @GetMapping()
    List<WatchlistItem> getAllWatchListItem()
    {
        return wlir.findAll();
    }

    @GetMapping("/id/{id}")
    WatchlistItem getWatchListItemById(@PathVariable int id){
        return wlir.findById(id).get();
    }

    @PostMapping()
    void insertWatchListItem(@RequestBody WatchlistItem watchlistItem) {
        wlir.save(watchlistItem);
    }

    @PutMapping()
    void updateWatchlistItem(@RequestBody WatchlistItem watchlistItem) {
        wlir.save(watchlistItem);
    }

    @DeleteMapping("/id")
    void deleteWatchlistItem(@PathVariable int id){
        wlir.deleteById(id);
    }



}
