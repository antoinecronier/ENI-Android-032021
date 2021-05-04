package com.example.tp1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class Article {
    private long id;
    private String name;
    private String info;
    private float price;
    private int ratting;
    private String url;
}
