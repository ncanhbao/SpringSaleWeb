/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ncb.repositories;

import com.ncb.pojo.Product;
import java.util.List;
import java.util.Map;
/**
 *
 * @author ncanh
 */
public interface ProductRepository {
    void addOrUpdate(Product p);
    public List<Product> getProds(Map<String, String> params);
}
