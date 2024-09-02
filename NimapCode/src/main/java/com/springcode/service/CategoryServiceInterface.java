package com.springcode.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springcode.entity.Category;

public interface CategoryServiceInterface {

    Page<Category> getAllCategories(Pageable pageable);

    Optional<Category> getCategoryById(Long categoryId);

    Category createCategory(Category category);

    Category updateCategory(Long categoryId, Category categoryDetails);

    void deleteCategory(Long categoryId);
}
