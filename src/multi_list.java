import java.util.ArrayList;

public class multi_list {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		ArrayList<Integer> list3=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		
		list3.add(7);
		list3.add(8);
		list3.add(9);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		
		
		System.out.println("add all in arrylist");
		list.add(list1);
		list.add(list2);
		list.add(list3);
		System.out.println(list);
		
		// to get 9 value in given matrix
		ArrayList <Integer> temp= list.get(2);
		System.out.println("row " +temp);
		System.out.println( "col value\t"+temp.get(2));
		//System.out.println(list.get(2).get(2));
	}

}
