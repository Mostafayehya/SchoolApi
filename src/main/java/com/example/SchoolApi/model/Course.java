package com.example.SchoolApi.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course",
        catalog = "schoolapi",
        uniqueConstraints = @UniqueConstraint(columnNames = "name")
)
public class Course {


    private Long id;
    private String name;
    private String description;


    @ManyToMany(mappedBy = "courses")
    public List<Student> getStudents() {
        return students;
    }

    private List<Student> students;

    public Course() {
    }

    public Course(String name, String description, List<Student> students) {
        this.name = name;
        this.description = description;
        this.students = students;
    }

    @Id
    @Column(name="id",unique = true,nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="name",unique = true,nullable = true)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="description",unique = false,nullable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
