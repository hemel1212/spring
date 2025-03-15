package second_spring.second_spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import second_spring.second_spring.model.Student;
import second_spring.second_spring.service.studentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	private final studentService service;

	public StudentController(studentService service) {
		this.service = service;
	}

	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		Student saveStudent = service.saveStudent(student);
		return saveStudent;

	}

	@GetMapping
	public List<Student> getStudent() {
		return service.getStudent();
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		service.deleteById(id);
	}

	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		Optional<Student> ExistingStudent = service.findStudentById(id);
		Student st = null;
		if (ExistingStudent.isPresent()) {
			st = ExistingStudent.get();

			if (st.getName() != student.getName())
				st.setName(student.getName());

			if (st.getAddress() != student.getAddress())
				st.setAddress(student.getAddress());

			if (st.getAge() != student.getAge())
				st.setAge(student.getAge());

			if (st.getClazz() != student.getClazz())
				st.setClazz(student.getClazz());

			if (st.getDob() != student.getDob())
				st.setDob(student.getDob());
		}
		return service.saveStudent(st);
	}

//	@PutMapping("/{id}")
//	public Student updateStudent(@PathVariable int id, CreateStudentDto studentDto) {
//		Optional<Student> ExistingStudent = service.findStudentById(id);
//		Student st = null;
//		if (ExistingStudent.isPresent()) {
//			st = ExistingStudent.get();
//
//			if (st.getName() != studentDto.getName())
//				st.setName(studentDto.getName());
//
//			if (st.getAddress() != studentDto.getAddress())
//				st.setAddress(studentDto.getAddress());
//
//			if (st.getAge() != studentDto.getAge())
//				st.setAge(studentDto.getAge());
//
//			if (st.getClazz() != studentDto.getClazz())
//				st.setClazz(studentDto.getClazz());
//
//			if (st.getDob() != studentDto.getDob())
//				st.setDob(studentDto.getDob());
//		}
//		return service.saveStudent(st);
//	}
}
