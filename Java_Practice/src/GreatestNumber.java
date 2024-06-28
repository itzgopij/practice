import java.util.Scanner;

public class GreatestNumber {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A:");
		int a=scan.nextInt();
		System.out.println("Enter B:");
		int b=scan.nextInt();
		System.out.println("Enter C:");
		int c=scan.nextInt();
		
	int ans= ((a==b)&&(a==c))?a:(b>c)?b:c;  //conditional operator
	System.out.println(ans);
	}

} 
