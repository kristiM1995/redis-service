package com.redis.example.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@Data
@RequiredArgsConstructor
@RedisHash(value = "Product", timeToLive = 600L)
public class Product {
    private String id;
    private String name;
    private String quantity;
    private String type;
}
