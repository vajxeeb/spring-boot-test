package com.example.Bill_Project.service;

import com.example.Bill_Project.entity.Shop;
import com.example.Bill_Project.repository.ShopRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class ShopService {

    @Autowired
    private  final ShopRepository shopRepository;

    //Save shop
    public Shop saveShop(MultipartFile file, Shop shp) throws IOException {
        log.info("Saving new shop", file.getBytes(), shp);
        Shop shop = new Shop(UUID.randomUUID().toString(), shp.getShop_name(), shp.getShop_contact(),shp.getShop_email(), shp.getShop_address(), file.getBytes());
        return shopRepository.save(shop);
    }
    //Get shop
    public List<Shop> getShops() {
        return shopRepository.findAll();
    }

}
