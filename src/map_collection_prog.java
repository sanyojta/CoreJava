import java.util.ArrayList;
import java.util.HashMap;

public class map_collection_prog {

	public static void main(String[] args) {
		// hashmap
		HashMap <String, Integer> hm= new HashMap<>();
		hm.put("pune", 41101);
		hm.put("Mumbai", 400001);
		hm.put("Nanded", 431001);
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println( "size of Map="+hm.size());
		
		hm.replace("pune", 411001);
		System.out.println(hm);
		
		hm.remove("Mumbai");
		System.out.println(hm);
		
		System.out.println(hm.containsKey("pune"));
		System.out.println(hm.containsValue(300002));
		
		System.out.println(hm.get("pune"));
		System.out.println(hm.get("punee"));
		
		
		for (String key : hm.keySet()) 
		{
			System.out.println( "Key:"+ key+ "\t"+ "Value:"+hm.get(key));	
		}
		
		
		HashMap <Integer ,ArrayList<String>> map= new HashMap<>();
		
		ArrayList<String> list1=new ArrayList<>();
		
		list1.add("Amol Paleker");
		list1.add("Finance");
		list1.add("Developer");
		map.put(1111, list1);
		System.out.println( map);
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("somya sharma");
		list2.add("tester");
		list2.add("selenium");
        map.put(2222, list2);
	    System.out.println( map);
		
		System.out.println( map.get(1111).get(2));
		
		
		HashMap<String ,HashMap<Integer,ArrayList<String>>> hashmap = new HashMap<>();
		
		//{"abc"={1=["ab","bc"]}}
		ArrayList<String> list3=new ArrayList<>();
		ArrayList<String> list4=new ArrayList<>();
		ArrayList<String> list5=new ArrayList<>();
		
		list3.add("Amol Shinde");
		list3.add("Developer");
		list3.add("Java");
		
		

		list4.add("Amol kadam");
		list4.add("Developer");
		list4.add(".Net");
		

		list5.add("Amol Patil");
		list5.add("Tester");
		list5.add("Automation");
		
				
				
				
				
				
		HashMap <Integer,ArrayList<String> >details= new HashMap<>();
		HashMap <Integer,ArrayList<String> >details1= new HashMap<>();
		HashMap <Integer,ArrayList<String> >details2= new HashMap<>();
		details.put(1, list3);
		details1.put(2, list4);
		details2.put(3, list5);
		

		hashmap.put("Finance \t", details);
		hashmap.put("Aset Management\t", details1);
		hashmap.put("Investemnt\t", details2);
		System.out.println(hashmap);
		
		
		
		
	}

}
