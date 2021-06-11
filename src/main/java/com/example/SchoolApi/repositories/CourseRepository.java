package com.example.SchoolApi.repositories;

import com.example.SchoolApi.model.Course;
import com.example.SchoolApi.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "courses",path = "courses")
public interface CourseRepository extends PagingAndSortingRepository<Course,Long> {
}
