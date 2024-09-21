package edu.eci.cvds.parcial.miguel.products;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductManagerTest {
    @Autowired
    private ProductManager productManager;
    @BeforeEach
    void setUp() {

    }
    @Test///
    void contextLoads() {
    }

}