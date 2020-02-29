package oops_concept;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String:"); 
		String str=sc.nextLine();
		reverse_string rv=new reverse_string();
		rv.reverse(str);

	       }

	public void reverse(String str)
	{ 
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{   char result= str.charAt(i);
			temp= temp+result;
             }
		System.out.println( "Reverse String is:" +temp);
	}
	
	
}
