package Scenarios;

public class arrayprgm3 {
	
	public static void main(String[] args) {
		double sum=0;
		
		double arr[]=new double[4];
		
		arr[0]=2.3;
		arr[1]=22.3;
		arr[2]=25.5;
		arr[3]=29.7;
		
		for(int i=0; i<4; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
