import java.util.Scanner;

public class PalindromeOrNot2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=scan.nextInt();
		int r,sum=0;
		int temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
             System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
	}

}
