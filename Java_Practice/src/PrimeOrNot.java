import java.util.Scanner;  //prime or not

public class PrimeOrNot{	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		int count=0;
		if(n<=1) {
			count++;
		}
		
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) 
			count++;
		break;
		}
	if(count>=1)
		System.out.println("Not Prime");
	else 
		System.out.println("Prime");
	
	
	}

	}
 