package training;

public class Encapsulation {
	
	private int studentId;
	private String studentName;

	public void setStudentId(int id){
		this.studentId=id;
	}

	public void setStudentName(String name){
		this.studentName=name;

	}
	public int getSId(){
		return studentId;

	}
	public String getSname(){
		return studentName;

	}
	
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setStudentId(1010);
		e.setStudentName("vishnu");
		System.out.println(e.getSId());
		System.out.println(e.getSname());
	}
}
