
public class near_hundred {

	public static void main(String[] args) {
		near_hundred nh=new near_hundred();
		System.out.println(nh.nearhundred(36));
		System.out.println(nh.nearhundred(98));
	}
 public boolean nearhundred(int n)
 {
	 boolean result=false;
	 if((n>=90 &&n<=110)||(n>=90 &&n<=210))
	 {
		 result= true;
	 }
	return result;
	 
 }
}
