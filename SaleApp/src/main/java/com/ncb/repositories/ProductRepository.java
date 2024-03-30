/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ncb.repositories;

import com.ncb.pojo.Product;
import java.util.List;
/**
 *
 * @author ncanh
 */
public interface ProductRepository {
    List<Product> getProds();
    void addOrUpdate(Product p);
}
