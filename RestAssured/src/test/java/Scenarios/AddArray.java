package Scenarios;

public class AddArray 
{
public static void main(String[] args) 
{
	int [] a= {1,2,3,4,5};
	int [] b= {2,4,5,6};
	int length=a.length;
//	if(a.length<b.length)  //5<4
	//{
     // int  length=b.length;    //length=10
	//}
	for(int i=0;i<length;i++)  //0<10
	{
	try 
	  {
			System.out.print(a[i]+b[i]+" "); //1+2
		}

	catch(Exception e)
	{
		if(a.length<b.length)  //5<10
		{
			System.out.println(b[i]);
		}
		else
		{
			System.out.println(a[i]);
		}
	}
}
}
}

