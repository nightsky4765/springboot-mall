package com.yuan.springbootmall.dao;

import com.yuan.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
