package com.tnsif.CollegeSystem;
import java.util.List;

public class Department {
    // Name of the department
    private String departmentName;

    // List of students in the department
    private List<Students> studentList;

    // Getter for the departmentName
    public String getDepartmentName() {
        return departmentName;
    }

    // Setter for the departmentName
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    // Getter for the studentList
    public List<Students> getStudentList() {
        return studentList;
    }

    // Setter for the studentList
    public void setStudentList(List<Students> studentList) {
        this.studentList = studentList;
    }


    @Override
    public String toString() {
        return "Department [departmentName=" + departmentName + ", studentList=" + studentList + "]";
    }
}