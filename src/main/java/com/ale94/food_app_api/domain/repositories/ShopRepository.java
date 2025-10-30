package com.ale94.food_app_api.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ale94.food_app_api.domain.entities.ShopEntity;

public interface ShopRepository extends JpaRepository<ShopEntity, Long> {

}
