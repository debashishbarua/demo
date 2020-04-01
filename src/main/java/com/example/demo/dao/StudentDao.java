package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentDao {
	
	public int create(Student student);

	public int update(Student student);

	public int delete(Student student);

	public List<Student> findAll();

}
