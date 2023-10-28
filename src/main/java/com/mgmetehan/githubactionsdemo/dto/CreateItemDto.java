package com.mgmetehan.githubactionsdemo.dto;

import com.mgmetehan.githubactionsdemo.model.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateItemDto {
    private String name;
    private Double price;
    private String brand;
    private String category;

    public Item toEntity(CreateItemDto createItemDto) {
        return Item.builder()
                .name(createItemDto.getName())
                .price(createItemDto.getPrice())
                .brand(createItemDto.getBrand())
                .category(createItemDto.getCategory())
                .build();
    }
}