package com.ale94.food_app_api.domain.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "shop")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ShopEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String addrees;
    private String hours;
    private String img;
    private String banner;
    private String phone;
    private Boolean status;
    private String link;
    private List<String> tags;
    private Boolean hasDelivery;
    private Double deliveryPrice;
    private Integer rating;
    private Integer ratingReview;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "shop"
    )
    private List<MenuEntity> menu;

}
