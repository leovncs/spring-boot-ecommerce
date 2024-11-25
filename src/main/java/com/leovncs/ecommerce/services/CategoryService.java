package com.leovncs.ecommerce.services;

import com.leovncs.ecommerce.entities.Category;
import com.leovncs.ecommerce.entities.User;
import com.leovncs.ecommerce.repositories.CategoryRepository;
import com.leovncs.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
