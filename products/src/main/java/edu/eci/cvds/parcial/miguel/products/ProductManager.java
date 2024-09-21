package edu.eci.cvds.parcial.miguel.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class ProductManager implements ProductManage {

    private ArrayList<Product> products;

    @Autowired
    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public void deleteItem(String name) {

    }

    @Override
    public void addItem(String name, float price) {
        if(checkUniqueItem(name)){
            products.add(new Product(name, price));
        } else {
            getProductByName(name).setPrice(price);
        }
    }


    @Override
    public void updateItem(String name, float price) {
        products.forEach(product -> product.setPrice(price));
    }

    @Override
    public Product getStockProduct(String name) {
        return getProductByName(name);
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return products;
    }
    private Product getProductByName(String name) {
        Product product = null;
        for(Product p : products){
            if (p.getName().equals(name)) {
                product = p;
            }
        }
        return product;
    }
    private boolean checkUniqueItem(String name){
        boolean unique = true;
        for(Product p : products){
            if(p.getName().equals(name)) unique = false;
        }
        return unique;
    }
}
