import java.util.Scanner;

public class BitwiseOperator {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A:");
		int a=scan.nextInt();
		System.out.println("Enter B:");
		int b=scan.nextInt();
		int temp; //input a=10 b=20 
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
		
		
	}
	
	

}
