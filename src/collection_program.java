import java.util.ArrayList;
import java.util.List;

public class collection_program {

	public static void main(String[] args) {
		//list arraylist
		ArrayList <String> arr1= new ArrayList<>();
		arr1.add("Radical");
		arr1.add("Tech");
		arr1.add("Kharadi");
		arr1.add("Tech");
		 
		System.out.println(arr1);
		 arr1.remove("Tech");
		 System.out.println(arr1);
		
		 System.out.println("size of array:"+arr1.size()); 
	 // contain - to check(false, true)
		
		 
		 System.out.println(arr1.contains("Tech"));
		System.out.println(arr1.indexOf("Tech"));
		System.out.println(arr1.get(0));//to get value of index
	    
		
		List <String> newarr1=arr1.subList(0, 1);//last index value not include
	      System.out.println(newarr1);
	      
	      
	      System.out.println("___________________");
	      for(int i= 0;i<arr1.size();i++){
	    	  System.out.println(arr1.get(i));
	      }
	      System.out.println("___________________");
	     for (String x : arr1) {
          System.out.println(x);
	    		
	      }
	}

}
