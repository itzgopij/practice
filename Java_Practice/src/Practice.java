
public class Practice {

	public static void main(String[] args) { 
		int inputArray[]= {3, 6, -2, -5, 7, 3};
		int multi[]=new int[inputArray.length-1]; int j=0;
		for(int i=0;i<=inputArray.length-2;i++){
			
			for( j=i+1;j<=i+1;j++){
		    	
		         multi[i]=inputArray[i]*inputArray[j];
		    }
		}
		int max=multi[0];
		for(int k=0;k<multi.length;k++){
		    if(max<multi[k])
		    max=multi[k];
		}
		System.out.println(max);//return max;
		
		
		}

	}


