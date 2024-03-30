/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ncb.services;

import com.ncb.pojo.Product;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ProductService {
    List<Product> getProds();
    public void addOrUpdate(Product p);
}