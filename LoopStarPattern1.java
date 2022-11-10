package basicprogram;

public class LoopStarPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)   //row
        {
        	for(int j=1;j<=i;j++)   //col
        	{
        		System.out.print("*");
        	}  //end of internal loop
        	
        	System.out.println();  //print new line
        }   //end of external loop
        
        
      
	}
}
