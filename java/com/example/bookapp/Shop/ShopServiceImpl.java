package com.example.bookapp.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public Shop saveShop(Shop shop){
        return shopRepository.save(shop);
    }

    @Override
    public List<Shop> getAllShops(){
        return shopRepository.findAll();
    }


}
