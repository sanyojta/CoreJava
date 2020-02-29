package oops_concept;

public class inhr_example1  extends inher_example 
{
	int result=0;
	void addition( int a,int b )
	{
		result=a+b;
         System.out.println("The result of addition is:"+ result);
	}
	
	void subtraction(int a,int b)
	{
		result=a-b;
         System.out.println("The result of subtraction is:"+ result);
	}
	
	void multipication(int a,int b)
	{
		result=a*b;
         System.out.println("The result of multipication is:"+ result);
	}
	
	void division(int a,int b)
	{
		result=a/b;
         System.out.println("The result of  division is:"+ result);
	}
}
