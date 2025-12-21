package com.yuan.springbootmall.service;

import com.yuan.springbootmall.constant.ProductCategory;
import com.yuan.springbootmall.dto.ProductRequest;
import com.yuan.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String seach);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
