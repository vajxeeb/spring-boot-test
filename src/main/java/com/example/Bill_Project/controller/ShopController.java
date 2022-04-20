package com.example.Bill_Project.controller;

import com.example.Bill_Project.entity.Shop;
import com.example.Bill_Project.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/shop")
@AllArgsConstructor
public class ShopController {

    @Autowired
    private final ShopService shopService;

    @PostMapping()
    public Shop saveShop(@RequestParam("file") MultipartFile file, Shop shop) throws IOException {
        return shopService.saveShop(file, shop);
    }
}
