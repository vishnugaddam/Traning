package training;

public class ParsingArrays {
	//Passing Array to a Method
	static void m1(int[] a){
		for(int a1:a){
			System.out.println(a1);
		}
	}

	public static void main(String[] args) {
		int[] a={10,20,30};
		ParsingArrays.m1(a);//passing array to method  
	}	


}
