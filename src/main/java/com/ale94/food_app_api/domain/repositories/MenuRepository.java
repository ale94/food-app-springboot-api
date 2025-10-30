package com.ale94.food_app_api.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ale94.food_app_api.domain.entities.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {

}
