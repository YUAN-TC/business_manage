package com.neuedu.service;


import com.neuedu.pojo.Category;

import java.util.List;

public interface ICategoryService {

    public int addCategory(Category category);

    public int deleteCategory(int id );

    public int updataCategory(Category category);

    public List<Category> findAllCategory();

    public  Category findCategoryById(Integer id);

}
