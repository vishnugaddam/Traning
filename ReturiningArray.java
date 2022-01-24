package training;

public class ReturiningArray {	
	static int[] m1(){
		System.out.println("m1 method");
		return new int[]{100,200,300};
	}
	
	public static void main(String[] args) {
		int i[]=ReturiningArray.m1();
		for(int x:i){
			System.out.println(x);
		}

	}

}
