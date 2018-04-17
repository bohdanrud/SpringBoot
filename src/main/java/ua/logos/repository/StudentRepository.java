package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.logos.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
