package com.relation.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stdeunt_card")
public class StudentCard {

    @Id
    private int serialNumber;

    @Column
    private Date IssueDate;

    @OneToOne(mappedBy = "studentCard")
    private Student student;

    public StudentCard(int serialNumber, Date issueDate, Student student) {
        this.serialNumber = serialNumber;
        IssueDate = issueDate;
        this.student = student;
    }

    public StudentCard() {
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(Date issueDate) {
        IssueDate = issueDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
