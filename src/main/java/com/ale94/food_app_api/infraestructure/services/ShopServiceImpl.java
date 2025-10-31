package com.ale94.food_app_api.infraestructure.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ale94.food_app_api.domain.entities.ShopEntity;
import com.ale94.food_app_api.domain.repositories.ShopRepository;
import com.ale94.food_app_api.infraestructure.abstract_services.ShopService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;

    @Override
    public List<ShopEntity> getAll() {
        return this.shopRepository.findAll();
    }

    @Override
    public List<ShopEntity> getByTag(String tag) {
        return shopRepository.findAll()
                .stream()
                .filter(shop -> shop.getTags().contains(tag))
                .toList();
    }

}
