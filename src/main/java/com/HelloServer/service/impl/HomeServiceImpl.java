package com.HelloServer.service.impl;

import com.HelloServer.service.HomeService;

import java.util.ArrayList;
import java.util.List;

public class HomeServiceImpl implements HomeService {
    @Override
    public List<String> loadMenu() {
        List<String> menu = new ArrayList<>();
        menu.add("Home");
        menu.add("Room");
        menu.add("Blog");
        menu.add("Introduction");
        return menu;
    }
}
