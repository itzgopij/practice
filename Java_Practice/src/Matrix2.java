
public class Matrix2 {     //sum of diagnoal 

	public static void main(String[] args) {
		int a[][]= {{1,2,3} ,{4,5,6}, {7,8,9}};
		
		int sum=0,i=0,j=0; int n=a.length;
		
		while(i<n) {
			sum=sum+a[i][j];
			i++;
			j++;
		}
		i=0;j=n-1;
		while(j>=0) {
			if(i!=j) 
				//continue;
			
			sum=sum+a[i][j];
			i++;
			j--;
		}
		System.out.println(sum);

	}

}
