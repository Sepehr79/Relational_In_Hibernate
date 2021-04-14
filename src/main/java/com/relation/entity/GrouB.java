package com.relation.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class GrouB {

    @Id
    private int id;

    @Column
    private String name;

    @OneToMany(mappedBy = "groub")
    private List<Student> studentList;

    public GrouB(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public GrouB() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
