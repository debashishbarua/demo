package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Address;
import com.example.demo.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Student student) {
		String query = "insert into student values(?,?,?,?)";
		return jdbcTemplate.update(query, 
				new Object[] { student.getId(), student.getName(),
						student.getCourse(), student.getAddress().getHouseNo()});

	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> findAll() {
		String query = "select * from student";
		return jdbcTemplate.query(
				query, 
				(rs, rowNum) -> new Student(rs.getInt(1), rs.getString(2), rs.getString(3),new Address(rs.getString(4))));

	}

}
