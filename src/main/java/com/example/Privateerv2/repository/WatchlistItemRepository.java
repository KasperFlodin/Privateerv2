package com.example.Privateerv2.repository;

import com.example.Privateerv2.model.WatchlistItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchlistItemRepository extends JpaRepository <WatchlistItem, Integer> {

}
