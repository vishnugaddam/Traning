package training;

public class CopyDataArray {

	public static void main(String[] args) {
	int [] copyfrom={10,20,30,40,50,60,70,80};
	int [] copyTo=new int[7];
	System.arraycopy(copyfrom, 0, copyTo, 0, 7);

	for(int cc:copyTo){
		System.out.println(cc);
	}

	}

}
