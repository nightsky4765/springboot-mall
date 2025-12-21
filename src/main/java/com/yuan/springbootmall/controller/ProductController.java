package com.yuan.springbootmall.controller;

import com.yuan.springbootmall.dto.ProductRequest;
import com.yuan.springbootmall.model.Product;
import com.yuan.springbootmall.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId){
        Product product = productService.getProductById(productId);

        if (product != null){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest){
        Integer productId = productService.createProduct(productRequest);

        Product product = productService.getProductById(productId);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @PutMapping("/products/{prodcutId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer prodcutId,
                                                 @RequestBody @Valid ProductRequest productRequest){
        // 檢查 Product 是否存在
        Product product = productService.getProductById(prodcutId);

        if (product == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        // 修改商品的數據
        productService.updateProduct(prodcutId, productRequest);

        Product updateProduct = productService.getProductById(prodcutId);

        return ResponseEntity.status(HttpStatus.OK).body(updateProduct);
    }
}
