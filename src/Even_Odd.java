import java.util.Scanner;

public class Even_Odd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter 1th value:");
		int x= sc.nextInt();
	System.out.println("1th value:"+x);
	if(x%2==0)
	{
		System.out.println("no is even");
	}
	else
	{
		System.out.println("no is odd");
	}
	}

}
