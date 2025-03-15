package second_spring.second_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import second_spring.second_spring.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}