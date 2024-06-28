import java.util.Scanner;

public class MarkList{
 public static void main(String args[]) {
	 
	 Scanner scan=new Scanner(System.in);
	 int c=0;
	 System.out.println("TAMIL:");
	 int tam=scan.nextInt();
	 if(tam<35)
		 c++;
	 System.out.println("ENGLISH:");
	 int eng=scan.nextInt();
	 if(eng<35)
		 c++;
	 System.out.println("MATHS:");
	 int math=scan.nextInt();
	 if(math<35)
		 c++;
	 System.out.println("SCIENCE:");
	 int sci=scan.nextInt();
	 if(sci<35)
		 c++;
	 System.out.println("SOCIAL:");
	 int soc=scan.nextInt();
	 if(soc<35)
		 c++;
	 int tot=tam+eng+math+sci+soc;
	 System.out.println("TOTAL="+tot);
	 if(c==0)
	 {
		 System.out.println("RESULT:PASS");
	 }
	 else
	 {
		 System.out.println("RESULT:FAIL");
	 }
	 
 }
 }

