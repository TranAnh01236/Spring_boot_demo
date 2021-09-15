package com.Spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring_boot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
