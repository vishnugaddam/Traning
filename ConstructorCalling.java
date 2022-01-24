package training;

public class ConstructorCalling {
	ConstructorCalling( )  
	{
		this(100); 		//current class 1-arg constructor calling   
		System.out.println("0-arg constructor  logics");  
	}  
	ConstructorCalling(int a)
	{ 
		this('g',10); //current class 2-arg constructor calling  
		System.out.println("1-arg constructor logics");   
		System.out.println(a);
	} 
	ConstructorCalling(char ch,int a)
	{ 
		System.out.println("2-arg constructor logics"); 
		System.out.println(ch+"----"+a);  
	}  
	public static void main(String[] args)  
	{ 
		new ConstructorCalling( );  
	} 
}


