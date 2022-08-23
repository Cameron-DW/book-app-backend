package com.example.bookapp.Shop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
}
