
public class Matrix1 {  // find missing number in distinct array 

	public static void main(String[] args) {
		int nums[]= {9,6,4,2,3,8,7,0,1};
		
		int len=nums.length; int sum=0;
		
		for(int x:nums) {
			sum+=x;
		}
		
		int val=len*(len+1)/2;
		
		int ans = val-sum;
		System.out.println(ans);
	}
}
