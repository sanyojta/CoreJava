package oops_concept;

public class throw_example {

	public static void main(String[] args) throws Exception {
		throw_example te=new throw_example();
		te.myException("opera");
		
	}
 public void myException(String browsrName) throws Exception
 {
	 if(browsrName.equals("chrome"))
	 {
		 System.out.println("browser is chrome");
	 }else if(browsrName.equals("firefox"))
	 {
		 System.out.println("browser is firefox"); 
	 }
	 else{
		 throw new Exception ("Invalide browser name");
	 }
 }
}
