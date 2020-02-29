package oops_concept;

import java.util.Scanner;


public class multipal_Catch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a String:");
		String str=sc.nextLine();
		String str1=null;
		try{
			System.out.println(str1.length());
			
			System.out.println(str.charAt(0));
		 }
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("Exception :"+s.getMessage());
			int length=str.length();
			System.out.println("max lenght of string is :"+length);
		}
		catch( NullPointerException npe)
		{
			System.out.println("Exception :"+npe.getMessage());
			str1= "pune";
			System.out.println(str1);
		}
		
		catch(Exception e){
			System.out.println("Exception :"+e.getMessage());
		}
		finally{
			System.out.println("Finally block  is exe.");
	} 
	
		
	}

}
