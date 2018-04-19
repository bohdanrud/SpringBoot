package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.logos.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	@Query("SELECT c FROM Category c WHERE c.name = :name")
	Category findCategoryByName(@Param("name") String name);
}
