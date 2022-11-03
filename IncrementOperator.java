package basicprogram;

public class IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //pre increment
		int x=10,y;
		y=++x;
		System.out.println("X is :"+x+" "+" Y is :"+y);
		
		
		//post increment
		int x1=10,y1;
		y1=x1++;
		System.out.println("X is :"+x1+" "+" Y is :"+y1);
		
		
		
		//post decrement
		int l=10,m;
		m=l--;
		System.out.println("L is :"+l+" "+" M is :"+m);
	}

}
