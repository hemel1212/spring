package second_spring.second_spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import second_spring.second_spring.model.Student;
import second_spring.second_spring.repository.StudentRepository;

@Service
public class studentService {

	private final StudentRepository repository;

	public studentService(StudentRepository repository) {
		this.repository = repository;
	}

	public Student saveStudent(Student student) {
		Student saved = repository.save(student);
		return saved;
	}

	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	public Optional<Student> findStudentById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
