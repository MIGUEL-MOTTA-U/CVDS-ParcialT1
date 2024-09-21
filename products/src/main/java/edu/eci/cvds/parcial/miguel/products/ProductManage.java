package edu.eci.cvds.parcial.miguel.products;

import java.util.ArrayList;

public interface ProductManage {
    public void deleteItem(String name);
    public Product addItem(String name, float price);
    public void updateItem(String name, float price);
    public Product getStockProduct(String name);
    public ArrayList<Product> getAllProducts();
}
