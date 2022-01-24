package training;

public class Default {
	
	int id;
	String name;	
	
	Default(){
		
	}
	
	void m1(){
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
	Default d=new Default();
	d.m1();

	}

}
