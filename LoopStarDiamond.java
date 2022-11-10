package basicprogram;

import java.util.Scanner;

public class LoopStarDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int n=sc.nextInt();
        
        for(i=1;i<=n;i++)  //row
        {
        	
        	for(j=n;j>i;j--)  //space
        	{
        		System.out.print(" ");
        	}
        	
        	for(k=1;k<=i;k++)  //star
        	{
        		System.out.print("*");
        	}
        	
        	System.out.println();
        }
     
        
        //reverse
        for(i=1;i<=5;i++)
        {
        	for(j=1;j<i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(k=5;k>=i;k--)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
