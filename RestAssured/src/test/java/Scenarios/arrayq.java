package Scenarios;

import java.util.Scanner;

public class arrayq {
public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	     System.out.println("eneter the 1st Oject size");
	int	size=sc.nextInt();
    System.out.println("eneter the 2nd Oject size");
	int size1=sc.nextInt();
	int a[]=new int[size];
	int b[]=new int[size1];
	
	//To Know which Object Size is more
	int LargestSize=a.length;
	if(a.length<b.length)
		LargestSize=b.length;
	
 
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
 	
     
 	System.out.println("After Adding :");
 	
     for (int i = 0; i < LargestSize; i++) 
 	{
	try {
    	
		System.out.println(a[i]+b[i]);

	} catch (Exception e)
	{
		//To Know Which Object have More Value
		if(a.length>b.length)
			System.out.println(a[i]);
		else {
			System.out.println(b[i]);
		}
	}
		
	
 	}
}
}