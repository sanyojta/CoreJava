
public class diff21 {

	public static void main(String[] args) {
		diff21 obj1= new diff21();
		obj1.diff2(10);
		obj1.diff2(19);
		obj1.diff2(21);
	}
public int diff2(int n)
{
	int result=0;
	if(n<=21)
	{
		 result=21-n;
	}
	else
	{
		result=2*(21-n);
	}
	
	return result;
	
}
}
