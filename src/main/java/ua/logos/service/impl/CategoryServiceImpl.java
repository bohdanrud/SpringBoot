package ua.logos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.logos.entity.Category;
import ua.logos.repository.CategoryRepository;
import ua.logos.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public void saveCategory(Category category) {
		// TODO Auto-generated method stub
		categoryRepository.save(category);
	}

	@Override
	public Category findCategoryById(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.getOne(id);
	}

	@Override
	public List<Category> findAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
