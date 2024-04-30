package com.example.Privateerv2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
@Entity
@Table
public class WatchlistItem {
    @Id int id;
    Instant watched;
    Instant added;
    float rating;

    public WatchlistItem() {}

}
