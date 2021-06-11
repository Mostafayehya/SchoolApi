package com.example.SchoolApi.repositories;

import com.example.SchoolApi.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "students",path = "students")
public interface StudentRepository extends PagingAndSortingRepository<Student,Long> {
}
