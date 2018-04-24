package ua.logos.service.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import ua.logos.domain.SimpleFilter;
import ua.logos.entity.Student;
import ua.logos.repository.StudentRepository;
import ua.logos.service.StudentService;

@Service
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

	@Override
	public List<Student> findAllStudentsByFilter(SimpleFilter filter) {
		// TODO Auto-generated method stub
		return studentRepository.findAll(getSpecification(filter));
	}

	private Specification<Student> getSpecification(SimpleFilter filter){
		return new Specification<Student>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				// TODO Auto-generated method stub
				if(filter.getSearch().isEmpty()) return null;
				
				return cb.like(root.get("fullName"), "%" + filter.getSearch() + "%");
				
			}
			
		};
	}

	@Override
	public Page<Student> findStudentByPage(Pageable pageble) {
		// TODO Auto-generated method stub
		PageRequest pageRequest = new PageRequest(pageble.getPageNumber(), pageble.getPageSize(), pageble.getSort());
		return studentRepository.findAll(pageRequest);
	}
}
