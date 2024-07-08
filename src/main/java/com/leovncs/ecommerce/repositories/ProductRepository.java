package com.leovncs.ecommerce.repositories;

import com.leovncs.ecommerce.entities.Category;
import com.leovncs.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
