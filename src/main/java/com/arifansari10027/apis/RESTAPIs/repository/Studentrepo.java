// This file helps to write the query

package com.arifansari10027.apis.RESTAPIs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arifansari10027.apis.RESTAPIs.entity.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student, Integer>{
}
