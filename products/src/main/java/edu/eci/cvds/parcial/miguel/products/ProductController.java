package edu.eci.cvds.parcial.miguel.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductManager productManager;

    @PostMapping(produces = "application/json")
    public ResponseEntity<Product> add(@RequestBody String name, float price){
        Product addedProduct = this.productManager.addItem(name, price);
        return new ResponseEntity<>(addedProduct, HttpStatus.CREATED);
    }
}
