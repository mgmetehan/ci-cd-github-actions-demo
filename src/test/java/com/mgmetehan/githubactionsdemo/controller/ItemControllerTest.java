package com.mgmetehan.githubactionsdemo.controller;

import com.mgmetehan.githubactionsdemo.service.ItemService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

/*
    @Test //Fail test
    public void createItemTest() {
        int a = 1;
        int b = 2;
        assertEquals(4, a + b);
    }
*/

    @Test //Success test
    public void createItemTest() {
        int a = 1;
        int b = 2;
        assertEquals(3, a + b);
    }
}