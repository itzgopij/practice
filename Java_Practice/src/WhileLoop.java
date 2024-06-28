import java.util.*;
public class WhileLoop { //Factorial of given number
	
          public static void main(String args[]) {
        	  
        	  Scanner scan = new Scanner(System.in);
        	  System.out.println("Enter a NUMBER:");
        	  int num=scan.nextInt();
        	  
        	  int i=1;int multi=1;
        	  while(i<=num) {
        		  multi=multi*num;
        		  num--;
        	  }
        	  System.out.println(multi);
	
}
}
		
	
	
	
			
		
		
		
	


