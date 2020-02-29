import java.util.HashSet;

public class Set_collection {

	public static void main(String[] args) {
	HashSet <String>arr1=new HashSet<>();
	arr1.add("pune");
	arr1.add("nanded");
	arr1.add("amravti");
	arr1.add("pune");// duplicate remove automatically
	arr1.add(null);
	
	
System.out.println(arr1);

System.out.println("using ForEach loop");
     for (String str: arr1) 
     {
    	 System.out.println(str);
	}
	
	}

}
