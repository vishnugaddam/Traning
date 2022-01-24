package training;

public class Test {

	//constructor declared by user 
	Test()  
	{ System.out.println("0-arg constructor");  
	}  
	Test(int i)  
	{ System.out.println("1-arg constructor"); 
	} 
	Test(int a,int b) 
	{ System.out.println("2-arg constructor");  
	}   
	public static void main(String[] args) 
	{ 
		Test t1=new Test();
		Test t2=new Test(10);
		Test t3=new Test(100,200);
		
	} 
}
