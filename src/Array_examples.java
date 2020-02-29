
public class Array_examples {

	public static void main(String[] args) {
		String []cars={"volvo","toyoto","maroti"};
		for(int i =0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}
		System.out.println("after for");
		System.out.println(cars[0]);
		cars[1]= "BMW";
		System.out.println(cars[1]);
		
		int[] numbers=new int[5];
		//reduce size we need to create new array
		int newarr[]= new int[4];
		int index=3;
		numbers[0]=1;
		numbers[1]=10;
		numbers[2]=100;
		numbers[3]=1000;
		numbers[4]=10000;
		
		 int j=0;
		for(int i=0; i<numbers.length;i++) //for (int i=0; i<numbers.length;i++)
		{ if(i==index){
			continue;
		}
		newarr[j]=numbers[i];
		j++;
			//System.out.println(numbers[i])	;
		}
		for(int i=0; i<numbers.length;i++)
		{ System.out.println(newarr[i]);
		
	}

}
}