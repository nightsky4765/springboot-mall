package com.yuan.springbootmall.dao;

import com.yuan.springbootmall.dto.ProductRequest;
import com.yuan.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
