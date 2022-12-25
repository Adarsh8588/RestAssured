package Scenarios;

import java.util.Scanner;

//add two array
public class arrayprgm4 
{	
public static void main(String[] args)
{
	//Give Option for User
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the Size");
	int size=s.nextInt();
	
	//Create Array Object
	int a[]=new int[size];
	
	System.out.println("Enter the Values");
	//Store
	
	for (int i = 0; i < a.length; i++) 
	{
		a[i]=s.nextInt();
	}
	
	System.out.println("User Enterd Values are :");
	for (int i = 0; i < a.length; i++) 
	{
		System.out.println(a[i]);
	}
}
}
