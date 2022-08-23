package com.example.bookapp.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping
    public Shop saveShop(@RequestBody Shop shop){
        return shopService.saveShop(shop);
    }

    @GetMapping
    public List<Shop> getAllShops(){
       return shopService.getAllShops();
    }

}
