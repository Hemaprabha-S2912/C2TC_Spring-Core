package com.tnsif.CollegeSystem;
import java.util.List;

import com.tnsif.CollegeSystem.Department;
import com.tnsif.CollegeSystem.Students;

public class College {
    // Name of the company
    private String collegeName; 

    // List of departments within the company
    private List<Department> departmentList;

    // Getter for the companyName
    public String getCollegeName() {
        return collegeName;
    }

    // Setter for the companyName
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    // Getter for the departmentList
    public List<Department> getDepartmentList() {
        return departmentList;
    }

    // Setter for the departmentList
    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    // Method to print the company name and details of all departments and employees
    public void printCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        // Iterate through each department
        for (Department department : departmentList) {
            System.out.println("Department Name: " + department.getDepartmentName());
            // Iterate through each students in the department
            for (Students students : department.getStudentList()) {
                System.out.println(students); // Print employee details
            }
        }

        
    }
}
