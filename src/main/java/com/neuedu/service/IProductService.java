package com.neuedu.service;

import com.neuedu.pojo.Product;

import java.util.List;

public interface IProductService {



    public int addProduct(Product product);
    public int deleteProduct(int productId);
    public int updateProduct(Product product);
    public List<Product> selectallProduct();
    public Product selectBYid(int productId);



}
