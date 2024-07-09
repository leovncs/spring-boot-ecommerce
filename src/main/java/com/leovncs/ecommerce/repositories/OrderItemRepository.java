package com.leovncs.ecommerce.repositories;

import com.leovncs.ecommerce.entities.OrderItem;
import com.leovncs.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
