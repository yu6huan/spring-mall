package com.liuray.springbootmall.service;

import com.liuray.springbootmall.constant.ProductCategory;
import com.liuray.springbootmall.dto.ProductRequest;
import com.liuray.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
