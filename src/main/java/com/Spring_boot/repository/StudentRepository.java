package com.Spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Spring_boot.entity.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    @Query(value="select * from student", nativeQuery = true)
    List<Student> getAllStudents();


    @Transactional
    @Modifying
    @Query(value="delete student where id = :id", nativeQuery = true)
    void deleteStudentById(int id);

    @Transactional
    @Modifying
    @Query(value="update student set lastname=:lastname, firstname=:firstname, email=:email  where id = :id ", nativeQuery = true)
    void updateStudentById(int id, String lastname, String firstname, String email);
}
