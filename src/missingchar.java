
public class missingchar {

	public static void main(String[] args) 
	{
		missingchar mgc= new missingchar();
				System.out.println(mgc.misscharacter("kitten", 1));
				System.out.println(mgc.misscharacter("kitten", 0));
				System.out.println(mgc.misscharacter("kitten", 4));
	}
public String misscharacter(String str, int n)
{
	String result="";
	String front= str.substring(0, n);
	String back= str.substring(n+1);
	result=front+back;
	return result;
	
}
}
