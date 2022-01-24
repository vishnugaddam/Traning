package training;

public class Test2 implements Inter {
	
	public void m1(){
		System.out.println("m1 method");
		}  
	public void m2(){
		System.out.println("m2 method");
		} 
	public void m3(){
		System.out.println("m3 method");
		} 

	public static void main(String[] args) {
	Test2 t=new Test2();
	t.m1();
	t.m2();
	t.m3();
	}

	

}
