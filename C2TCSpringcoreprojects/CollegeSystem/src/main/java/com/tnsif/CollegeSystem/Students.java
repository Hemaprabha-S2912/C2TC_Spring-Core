package com.tnsif.CollegeSystem;

public class Students {
    // Unique registration number for the student
    private int regno;

    // Name of the student
    private String name;

    // Mobile number of the student
    private String mobile;

    // Department of the student
    private String dep;

    // Age of the student
    private int age;

    // Getter for student registration number
    public int getRegno() {
        return regno;
    }

    // Setter for student registration number
    public void setRegno(int regno) {
        this.regno = regno;
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Setter for student name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for student mobile number
    public String getMobile() {
        return mobile;
    }

    // Setter for student mobile number
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // Getter for student department
    public String getDep() {
        return dep;
    }

    // Setter for student department
    public void setDep(String dep) {
        this.dep = dep;
    }

    // Getter for student age
    public int getAge() {
        return age;
    }

    // Setter for student age
    public void setAge(int age) {
        this.age = age;
    }

    // Override toString method to display student details in a readable format
    @Override
    public String toString() {
        return "Students [regno=" + regno + ", name=" + name + ", mobile=" + mobile +
               ", dep=" + dep + ", age=" + age + "]";
    }
}
