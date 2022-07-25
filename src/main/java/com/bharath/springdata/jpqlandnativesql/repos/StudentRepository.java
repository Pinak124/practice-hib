package com.bharath.springdata.jpqlandnativesql.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.springdata.jpqlandnativesql.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
