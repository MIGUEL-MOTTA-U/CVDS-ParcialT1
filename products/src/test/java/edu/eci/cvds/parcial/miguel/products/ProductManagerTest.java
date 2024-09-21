package edu.eci.cvds.parcial.miguel.products;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

@SpringBootTest
class ProductManagerTest {
    private ProductManager productManager;
    @BeforeEach
    void setUp() {
        productManager = null;
        productManager = new ProductManager(new ArrayList<>());
    }
    @Test///
    public void deleteItem(){

    };
    @Test
    public void addItem(){
        productManager.addItem("Xbox", 300);
        //assertEquals(productManager.getStockProduct("Xbox").getName(), "Xbox");

    };
    @Test
    public void updateItem(String name, float price);

    @Test
    public Product getStockProduct(String name);
    @Test
    public ArrayList<Product> getAllProducts();

}