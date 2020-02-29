import java.util.Scanner;

public class scanner_table {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		
		
			
		System.out.println("Enter Number:");
		int num=obj.nextInt();
		
		for(int i=1;i<=10;i++){
			System.out.println(num+ "x"+i +"="+ i*num);
		}
		}
		
	}
     
