package chapter06;

public class Student {

	public String Name;
	public int Number;
	public String Department;
		
	public String getName() {
		return Name;
	}
	public int getNumber() {
		return Number;
	}
	public String getDepartment() {
		return Department;
	}
	
	public void setName(String name) {
		Name = name;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	public String toString() {
		return ("이름: "+ Name + " 학번: " + Number + " 소속학과: " + Department);
	}
	
	
}
