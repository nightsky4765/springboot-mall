package com.yuan.springbootmall.service;

import com.yuan.springbootmall.dto.ProductRequest;
import com.yuan.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
