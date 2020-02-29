
public class Calculator_practice1 
{
	int a,b,c;
	int result;
	Calculator_practice1(int x,int y, int z )
	{
		a=x;
		b=y;
		c=z;
		
		
	}
	

	void addition()
	{
		result=a+b+c;
         System.out.println("The result of addition is:"+ result);
	}
	
	void subtraction()
	{
		result=a-b-c;
         System.out.println("The result of subtraction is:"+ result);
	}
	
	void multipication()
	{
		result=a*b*c;
         System.out.println("The result of multipication is:"+ result);
	}
	
	void division()
	{
		result=a/b/c;
         System.out.println("The result of  division is:"+ result);
	}
	

}
