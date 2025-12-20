package com.yuan.springbootmall.service.impl;

import com.yuan.springbootmall.dao.ProductDao;
import com.yuan.springbootmall.model.Product;
import com.yuan.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductSerivceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
