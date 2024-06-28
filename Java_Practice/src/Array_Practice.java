import java.util.Scanner;

public class Array_Practice {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		
		while(true) {
			if(num%10==0)
			{
				//System.out.println(num);
				break;
				
			}
			num--;
		}
		System.out.println(num);
		}
}


