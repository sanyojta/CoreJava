import java.util.Scanner;

public class userchoice_y_n_example {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=obj.nextInt();
		checknopalindrome(num);
		obj.nextLine();
		System.out.println("Do you want to continue? yes/no");
		String userchoice=obj.nextLine();
		
		while(userchoice.equals("yes")||userchoice.equals("Yes"))
		{
			System.out.println("Enter Number:");
			num=obj.nextInt();
			checknopalindrome(num);
			obj.nextLine();
			System.out.println("Do you want to continue? yes/no");
			userchoice=obj.nextLine();
			
			
		}

	}

	public static void checknopalindrome(int num) 
	{
		
		int rev=0,temp,number=num;
		while(num>0)
		{
			temp=num%10;
			rev=(rev*10)+temp;
			num=num/10;
		}
if(number== rev)
{
	System.out.println("Given no is palindrome"+number);
}
else
{
	System.out.println("Given no is not palindrome"+number);
}
	}

}
