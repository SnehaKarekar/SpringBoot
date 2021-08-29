package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.jpaRepository.AppRepo1;
@RestController
public class StudentRestCntrl {
	@Autowired
	AppRepo1 repo;
	
	@GetMapping("/rest")
	public Optional<Student> findByName()
	{
		Optional<Student> stu=repo.findById(1);
		return stu;
	}
	
	@GetMapping("jsonData")
	public Student studentJsonData()
	{
		return new Student(2,"sneha");
	}
}
