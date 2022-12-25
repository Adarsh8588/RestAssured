package Scenarios;

public class reverse
{
public static void main(String[] args) {
	String s= "This is java programing question";
	String[] as = s.split("");
   String[] bs=s.split(" ");
	
	for(int i=as.length-1;i>=0;i--) //5>0, 4>0, 3>0,2>0,1>0,
	{
		
			System.out.print(as[i]+""); //question   
	}
	
	
 }
 }