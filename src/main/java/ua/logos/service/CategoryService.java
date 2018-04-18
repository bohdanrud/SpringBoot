package ua.logos.service;

import java.util.List;

import ua.logos.entity.Category;

public interface CategoryService {
	
	void saveCategory(Category category);
	
	Category findCategoryByName(String name);
	
	List<Category> findAllCategory();

}
