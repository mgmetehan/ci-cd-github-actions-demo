package com.mgmetehan.githubactionsdemo.controller;

import com.mgmetehan.githubactionsdemo.dto.CreateItemDto;
import com.mgmetehan.githubactionsdemo.model.Item;
import com.mgmetehan.githubactionsdemo.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping
    private Item createItem(@RequestBody CreateItemDto dto) {
        return itemService.createItem(dto);
    }
}
