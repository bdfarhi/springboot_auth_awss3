package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByEmail(String email) ;
    //transforms into SQL that searches databse for email that matches
    // other way to do is : @Query("SELECT s FROM Student s WHERE s.email= ?1") to find email
}
