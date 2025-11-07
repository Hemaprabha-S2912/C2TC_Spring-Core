package com.tnsif.CollegeSystem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeMain {
	
	public static void main(String[] args) {
        // Load the Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("College.xml");

        // Retrieve the Company bean
        College college = context.getBean("College", College.class);

        // Print the company details, including departments and employees
        college.printCollegeDetails();
        
        
    }
	
	

}
