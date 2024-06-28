import java.util.Scanner;
public class Fibonacci {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=scan.nextInt();
		int n1=21,n2=34,n3=0;
		System.out.print(n1+" "+n2+" ");
		int i=1;
		
		while(i<=num-2) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			i++;
		
		}
	}

}
