package com.Spring_boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import com.Spring_boot.entity.Student;
import com.Spring_boot.repository.StudentRepository;

@SpringBootTest
class SpringBootDemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	StudentRepository studentRepository;

	@Test
	void getAllStudents() {
		List<Student> students = studentRepository.getAllStudents();
		System.out.println(students);
	}

	@Test
	void updateStudentById() {
		studentRepository.updateStudentById(1, "datma", "lala", "ddddssss@gmail.com");
	}

	@Test
	void deleteStudentById(int id) {
		studentRepository.deleteStudentById(1);
	}
}
