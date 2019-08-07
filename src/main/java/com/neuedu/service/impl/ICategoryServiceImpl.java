package com.neuedu.service.impl;

import com.neuedu.dao.CategoryMapper;
import com.neuedu.pojo.Category;
import com.neuedu.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ICategoryServiceImpl implements ICategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public int addCategory(Category category) {
        categoryMapper.insert(category);
        return 1;
    }

    @Override
    public int deleteCategory(int id) {
        return  categoryMapper.deleteByPrimaryKey(id);

    }

    @Override
    public int updataCategory(Category category) {
        return  categoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public List<Category> findAllCategory() {
        return categoryMapper.selectAll();
    }

    @Override
    public Category findCategoryById(Integer id) {
       Category category= categoryMapper.selectByPrimaryKey(id);
       return category;
    }
}
