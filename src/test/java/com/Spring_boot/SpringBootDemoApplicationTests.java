package com.Spring_boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.Spring_boot.entity.Student;
import com.Spring_boot.repository.StudentRepository;

@SpringBootTest
class SpringBootDemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private StudentRepository studentRepository;

	@Test
	void addStudent() {
		Student student = new Student("thanh", "dat", "assddaaa@gmail.com");
		studentRepository.save(student);
	}

	@Test
	void getStudents() {
		List<Student> students = studentRepository.findAll();
		System.out.println(students);
	}

	@Test
	void deleteStudentById(int id) {
		studentRepository.deleteById(1);
	}
}
