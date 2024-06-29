package com.example.demoForJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoForJPA.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	
	
}
