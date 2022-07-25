package com.bharath.springdata.jpqlandnativesql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bharath.springdata.jpqlandnativesql.entities.Student;
import com.bharath.springdata.jpqlandnativesql.repos.StudentRepository;

@SpringBootTest
class JpqlandnativesqlApplicationTests {
   @Autowired
	StudentRepository repository;
	@Test
	void testStudentCreate() {
		Student student=new Student();
		student.setFirstName("John");
		student.setLastName("NElson");
		student.setScore(66);
		repository.save(student);
		Student student1=new Student();
		student1.setFirstName("Neel");
		student1.setLastName("Masters");
		student1.setScore(99);
		repository.save(student1);
	}

}
