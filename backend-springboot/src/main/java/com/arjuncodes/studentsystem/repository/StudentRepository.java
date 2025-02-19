package com.arjuncodes.studentsystem.repository;

import com.arjuncodes.studentsystem.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
