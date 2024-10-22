package com.atuluttam.mvc1.Repository;

import com.atuluttam.mvc1.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
