package com.neuedu.service.impl;

import com.neuedu.dao.ProductMapper;
import com.neuedu.pojo.Product;
import com.neuedu.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductServiceImpl implements IProductService {

    @Autowired
    ProductMapper productMapper;
    @Override
    public int addProduct(Product product) {
       int count= productMapper.insert(product);
       return count;
    }

    @Override
    public int deleteProduct(int productId) {
       productMapper.deleteByPrimaryKey(productId);
       return 0;
    }

    @Override
    public int updateProduct(Product product) {
       int count= productMapper.updateByPrimaryKey(product);
       return count;
    }

    @Override
    public List<Product> selectallProduct() {

        return productMapper.selectAll();
    }

    @Override
    public Product selectBYid(int productId) {

        return productMapper.selectByPrimaryKey(productId);
    }
}
