package com.yuan.springbootmall.dto;

import com.yuan.springbootmall.constant.ProductCategory;

public class ProductQueryParams {

    private ProductCategory productCategory;
    private String search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
