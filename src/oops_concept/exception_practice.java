package oops_concept;

import java.util.Scanner;

public class exception_practice {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a 1st no:");
		int x= sc.nextInt();
		System.out.println("enter a 2nd no:");
		int y= sc.nextInt();
		int z=0;
		String a="";
		try
		{
			z=x/y;
			try
			{
				System.out.println(a.charAt(1));
			}
			catch( Exception ex)
			{
				ex.printStackTrace();
				System.out.println("Exception is :"+ex.getMessage());
			}
		}
		
			
	
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception is:" +e.getMessage());
			z=5;
		}
		System.out.println("value of Z is: "+z);
	}

}
