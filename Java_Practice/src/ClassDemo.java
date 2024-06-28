class Box{
	static int boxCount;
	int length,breadth,height;
	
	static{
		System.out.println("From static block");
	}
	
	Box(int l,int b,int h){
		length=l; breadth=b;height=h;
		boxCount++;
	}
	
	Box(Box e){
		length=-1;breadth=-1;height=-1;
		boxCount++;
	}
	static void displayBoxCount(){
		System.out.println(Box.boxCount);
	}
	
}
public class ClassDemo {

	public static void main(String[] args) {
		Box b1=new Box(5,4,6);
		Box b2 = new Box(b1);
		//System.out.println(Box.boxCount);
	     Box.displayBoxCount();

	}

}
