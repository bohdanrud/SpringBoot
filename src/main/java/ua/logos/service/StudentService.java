package ua.logos.service;

import java.util.List;

import ua.logos.entity.Student;

public interface StudentService {

	void saveStudent(Student student);
	
	Student findStudentById(int id);
	
	List<Student> findAllStudents();
	
}
