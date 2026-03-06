package com.example.lab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//trigger CI

public class CustomListTest {

    private CustomList list;
    private City calgary;
    private City edmonton;

    @BeforeEach
    public void setUp() {
        list = new CustomList();
        calgary = new City("Calgary", "AB");
        edmonton = new City("Edmonton", "AB");
    }

    @Test
    public void testAddCity() {
        int before = list.getCount();
        list.addCity(calgary);
        assertEquals(before + 1, list.getCount());
    }

    @Test
    public void testHasCity() {
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        list.addCity(calgary);
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testGetCount() {
        assertEquals(0, list.getCount());

        list.addCity(calgary);
        assertEquals(1, list.getCount());

        list.addCity(edmonton);
        assertEquals(2, list.getCount());
    }
}