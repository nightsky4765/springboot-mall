package com.yuan.springbootmall.dao;

import com.yuan.springbootmall.constant.ProductCategory;
import com.yuan.springbootmall.dto.ProductRequest;
import com.yuan.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
