package com.ale94.food_app_api.api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ale94.food_app_api.domain.entities.ShopEntity;
import com.ale94.food_app_api.infraestructure.abstract_services.ShopService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/shops")
@RequiredArgsConstructor
public class ShopController {

    private final ShopService shopService;

    @GetMapping
    public ResponseEntity<List<ShopEntity>> getAll() {
        return ResponseEntity.ok(this.shopService.getAll());
    }

    @GetMapping("/tag/{tag}")
    public ResponseEntity<List<ShopEntity>> getByTag(@PathVariable String tag) {
        return ResponseEntity.ok(this.shopService.getByTag(tag));
    }

}
