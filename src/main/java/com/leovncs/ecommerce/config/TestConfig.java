package com.leovncs.ecommerce.config;

import com.leovncs.ecommerce.entities.User;
import com.leovncs.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Kauane Fernanda", "kauane@gmail.com", "988888888", "12345678");
        User u2 = new User(null, "Victória Lais", "victoria@gmail.com", "977777777", "12345678");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
