package Scenarios;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoArray {
public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	     System.out.println("eneter the 1st Object size");
	int	size=sc.nextInt();
    System.out.println("eneter the 2nd Object size");
	int size1=sc.nextInt();
	int a[]=new int[size];
	int b[]=new int[size1];
	
	//To Know which Object Size is more
	int LargestSize=a.length;  // any length we can add
	
	if(a.length<b.length)
		LargestSize=b.length;  //re-initilize the variable
	
  
	System.out.println("Enter the 1st Object Values");
     for (int i = 0; i < a.length; i++) 
 	{
 		a[i]=sc.nextInt();
 	}
   
 	System.out.println("Enter the 2nd Object Values");

     for (int j = 0; j < b.length; j++) 
 	{
 		b[j]=sc.nextInt();
 	}
 	
     int sum[]=new int[LargestSize];
 
 	
     for (int i = 0; i < LargestSize; i++) 
 	{
	try {
    	sum[i]=a[i]+b[i];

	} catch (Exception e)
	{
		//To Know Which Object have More Value
		if(a.length<b.length)
			sum[i]=b[i];		
		else {
			sum[i]=a[i];		}
	}	
 	}
     System.out.println("After adding :");
     Arrays.sort(sum);
     for (int i = 0; i < LargestSize; i++) 
  	{
     System.out.println(sum[i]);
  	}
     int FL=sum[sum.length-1];
     int FS=sum[0]; 
     System.out.println("1st Largest Number : "+FL);
     System.out.println("1st Smallest Number : "+FS);

     int SL=0;
     for (int i = LargestSize-1; i>=0 ; i--) 
   	{
    	 if(FL!=sum[i])
    	 {
    		 SL=sum[i];
    		 System.out.println("2nd Largest Number : "+SL);
    		 break;
    	 }
   	
   	}
     int Largest=FL+SL; 
     System.out.println("Adding 1st and 2nd Largest Number : "+Largest);
     for (int i = 0; i < LargestSize; i++) 
    	{
     	 if(FS!=sum[i])
     	 {
     		 System.out.println("2nd Smallest Number : "+sum[i]);
     		 break;
     	 }
    	
    	}
}
}