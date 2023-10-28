package com.mgmetehan.githubactionsdemo.service;

import com.mgmetehan.githubactionsdemo.dto.CreateItemDto;
import com.mgmetehan.githubactionsdemo.model.Item;
import com.mgmetehan.githubactionsdemo.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public Item createItem(CreateItemDto dto) {
        return itemRepository.save(dto.toEntity(dto));
    }
}
