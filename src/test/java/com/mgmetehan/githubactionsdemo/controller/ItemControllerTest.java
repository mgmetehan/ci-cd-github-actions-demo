package com.mgmetehan.githubactionsdemo.controller;

import com.mgmetehan.githubactionsdemo.service.ItemService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.fail;

class ItemControllerTest {
    private ItemController itemController;

    @Mock
    private ItemService itemService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        itemController = new ItemController(itemService);
    }

    @Test
    public void createItemTest() {
        // fail test intentionally
        fail("This test intentionally fails.");
    }
}