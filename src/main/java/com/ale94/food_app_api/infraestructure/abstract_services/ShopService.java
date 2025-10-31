package com.ale94.food_app_api.infraestructure.abstract_services;

import java.util.List;

import com.ale94.food_app_api.domain.entities.ShopEntity;

public interface ShopService {

    List<ShopEntity> getAll();

    List<ShopEntity> getByTag(String tag);

    ShopEntity getById(Long id);

}
