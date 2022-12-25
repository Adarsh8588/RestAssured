package Scenarios;

import org.testng.annotations.Test;

public class array {
	@Test
public void simple() {
	int a[]= {1,2,3,4}; //size is already passed i,e size is 4 and index is 3 means size-1, 4-1=3
	
			System.out.println("to print the value");
	for(int i=0;i<a.length;i++) {  // 
		System.out.println(a[i]);
	}
	
	System.out.println("even number in array");
	for(int i=0; i<a.length;i++) {
		if(a[i]%2==0)
			 System.out.println("  "+a[i]);
	}
		System.out.println("odd number");
		for(int i=0; i<a.length;i++) {
			if(a[i]%2!=0)
				 System.out.println("  "+a[i]);
		}
}
}
			

