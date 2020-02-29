
public class palindrome_no_1to1000 {

	public static void main(String[] args) {
		for(int num=1; num<=1000;num++ )
		{
			
			int rev=0;
					int temp=0;
			int number=num;
			while(number>0)
			{
				temp=number%10;
				rev=(rev*10)+temp;
				number=number/10;
			}
	if(num== rev)
	{
		System.out.println("Given no is palindrome"+num);
	}
		
		}
		
	}

}
