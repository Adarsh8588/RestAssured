package Scenarios;

public class findFirstLargestNo {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {2,3,4};
		int length=a.length;
	int sum[]= new int[length];
		
	for(int i=0; i<a.length;i++) 
	{
		//	System.out.println(a[i]);
	}
	
	for(int j=0; j<b.length;j++)
	{
			//System.out.println(b[j]);
	}	
	System.out.println("after adding");


	for(int i=0; i<length;i++) 
	{

    	sum[i]=a[i]+b[i];

    	System.out.println(sum[i]);
    
		}
	System.out.println("first larg no");
	System.out.println(sum[sum.length-1]);
	System.out.println("first smallest no");
	System.out.println(sum[0]);

		
		}
}
	

