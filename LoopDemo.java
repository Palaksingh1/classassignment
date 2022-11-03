package basicprogram;


public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i;
        for(i=1;i<=5;i++)
        {
        	System.out.println("Hello World");
        }
        
        //loop for numbers
        int j;
        for(j=1;j<=5;j++)
        {
        	System.out.println(j);
        }
        
        //loop for numbers to be printed backwards
        int k;
        for(k=5;k>=1;k--)  //k=0>=1  f
        {
        	System.out.println(k);   //5 4 3 2 1
        }
        
        //loop with upside down conditions
        int a=5;
        for(;a>=1;)     //a=0>=1  f
        {
        	System.out.println(a);   //5 4  3  2  1
        	a--;
        }
        
        
        //loop for printing all the odd no btw 1 to 50
        int b;
        for(b=1;b<=50;b++)   //b=0>=1 f
        {
        	if(b%2==1)
        		System.out.println(b);
        }
        
        //loop for printing it other way
        int c;
        for(c=1;c<=50;c=c+2)    //c=0>=1 f
        {
        	if(i%2==1)
        		System.out.println(c);
        }
        
        
	}

}
