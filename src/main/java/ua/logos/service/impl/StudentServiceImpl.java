package ua.logos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.logos.entity.Student;
import ua.logos.repository.StudentRepository;
import ua.logos.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.getOne(id);
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
