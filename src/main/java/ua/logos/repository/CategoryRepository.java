package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.logos.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
