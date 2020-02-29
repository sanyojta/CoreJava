
public class prime_no {

	public static void main(String[] args) 
	{
		/*int num=7;
		int count=0;
		for(int i= 1; i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		// TODO Auto-generated method stub
 if(count==2)
 {
	 System.out.println("no is prime");
 } else
 {
	 System.out.println("no is not prime"); 
 }
	}*/
		
		// 0 t0 100 prime
		
		
	for(int num=1;num <=100;num++)
	{  int count=0;
		
		for(int i= 1; i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		// TODO Auto-generated method stub
 if(count==2)
 {
	 System.out.println("no is prime ="+num );
 } else
 {
	 //System.out.println("no is not prime"); 
 }
	}
	
	
	
	}
}
