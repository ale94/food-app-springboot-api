package com.ale94.food_app_api.util;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ale94.food_app_api.domain.entities.MenuEntity;
import com.ale94.food_app_api.domain.entities.ShopEntity;
import com.ale94.food_app_api.domain.repositories.ShopRepository;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Builder
public class DataLoader implements CommandLineRunner {

    private final ShopRepository shopRepository;

    @Override
    public void run(String... args) throws Exception {

        ShopEntity napoli = ShopEntity.builder()
                .name("La Pizzería Napoli")
                .description("Auténtica pizza italiana con ingredientes frescos y masa casera.")
                .address("Av. Italia 1234")
                .hours("Lun-Dom 11:00-23:00")
                .img("napoli.jpg")
                .banner("banner-napoli.jpg")
                .phone("3512345678")
                .status(true)
                .link("https://pizzerianapoli.com")
                .tags(Arrays.asList("pizza", "italiana", "napolitana"))
                .hasDelivery(true)
                .deliveryPrice(2.5)
                .rating(5)
                .ratingReview(320)
                .build();

        napoli.setMenu(Arrays.asList(
                MenuEntity.builder()
                        .name("Pizza Margherita")
                        .description("Pizza clásica con mozzarella y albahaca.")
                        .price(8.5)
                        .img("pizza-margherita.jpg")
                        .available(true)
                        .shop(napoli).build(),

                MenuEntity.builder()
                        .name("Pizza Cuatro Quesos")
                        .description("Combinación de cuatro quesos italianos.")
                        .price(9.5)
                        .img("pizza-cuatroquesos.jpg")
                        .available(true)
                        .shop(napoli)
                        .build()));

        ShopEntity cafe = ShopEntity.builder()
                .name("El Buen Café")
                .description("Cafetería artesanal con granos seleccionados y pastelería casera.")
                .address("San Martín 850")
                .hours("Lun-Sab 08:00-20:00")
                .img("elbuen-cafe.jpg")
                .banner("banner-cafe.jpg")
                .phone("3515674321")
                .status(true)
                .link("https://elbuen-cafe.com")
                .tags(Arrays.asList("café", "desayuno", "dulce"))
                .hasDelivery(true)
                .deliveryPrice(0.0)
                .rating(4)
                .ratingReview(210)
                .build();

        cafe.setMenu(Arrays.asList(
                MenuEntity.builder()
                        .name("Café Latte")
                        .description("Café espresso con leche vaporizada y espuma ligera.")
                        .price(3.0)
                        .img("cafe-latte.jpg")
                        .available(true)
                        .shop(cafe)
                        .build(),
                MenuEntity.builder()
                        .name("Croissant de Manteca")
                        .description("Croissant artesanal recién horneado.")
                        .price(2.5)
                        .img("croissant.jpg")
                        .available(true)
                        .shop(cafe)
                        .build()));

        shopRepository.saveAll(Arrays.asList(napoli, cafe));
    }

}
