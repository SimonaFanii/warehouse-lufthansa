package com.sha.springbootjwtauthorization.service;

import com.sha.springbootjwtauthorization.model.Product;

import java.util.List;

public interface ProductService
{
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();


    Product updateProduct(Product product);


    Product getProductById(long productId);

}