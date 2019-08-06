package com.neuedu.dao;

import com.neuedu.pojo.Product;
import com.neuedu.pojo.ProductWithBLOBs;
import java.util.List;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbggenerated
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbggenerated
     */
    ProductWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbggenerated
     */
    List<Product> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Product record);
}