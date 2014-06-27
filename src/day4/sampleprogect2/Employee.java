package day4.sampleprogect2;

public class Employee {
	
	private String empName;
	private int grade;
	
	// constructor
	public Employee(String empName, int grade){
		this.empName = empName;
		this.grade = grade;
	}
	
	// get method for grade
	public int getGrade(){
		return grade;
	}
	
	/*public String getEmpInof(){
		return empName + "(" + grade + ")";
	}*/
	
	public String toString(){
		return empName + "(" + grade + ")";
	}
	
}
