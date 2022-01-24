package training;

public class Employee {

	int empId;
	String empName;
	
	Employee(int id,String name){
		empId=id;
		empName=name;
	}
	void empDetails(){
		System.out.println(empId+" "+empName);
	}
	public static void main(String[] args) {
	
	//creating object and passing values
		
		Employee e=new Employee(1057, "vishnu");
		e.empDetails();
	}

}
