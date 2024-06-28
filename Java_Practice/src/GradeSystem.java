import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks 0-100:");
		int mark=scan.nextInt();
		if(mark>=90) {
			System.out.println("Grade O");}
		else if(mark>=80) {
			System.out.println("Grade A");}
		else if(mark>=70) {
			System.out.println("Grade B");}
		else if(mark>=60) {
			System.out.println("Grade C");}
		else if(mark>=50) {
			System.out.println("Grade D");
		}
		else if(mark>=35 &&  mark<=49) {
			System.out.println("Grade E");}
		else if(mark<35){
			System.out.println("RA");}
		}

}
