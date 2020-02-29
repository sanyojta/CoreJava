
public class palindrom_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=191;
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
	System.out.println("Given no is no palindrome"+number);
}
	}

}
