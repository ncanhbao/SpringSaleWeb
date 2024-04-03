/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ncb.services.impl;

import com.ncb.pojo.Product;
import com.ncb.repositories.ProductRepository;
import com.ncb.services.ProductService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository prodRepo;

    @Override
    public List<Product> getProds(Map<String, String> params) {
        return this.prodRepo.getProds(params);
    }

    @Override
    public void addOrUpdate(Product p) {
        this.prodRepo.addOrUpdate(p);
    }

}
