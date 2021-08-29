package com.example.demo.jpaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Student;
@Service
public class Dboperation {
	@Autowired
	private AppRepo1 app;
	@GetMapping("/getData")
	public void registerStudent()
	{
		Iterable<Student> studentlist=app.findAll();
		System.out.println(studentlist);
	}
}
