package oopsconcepts;

import java.util.Scanner;
public class Perfect2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        Scanner sc= new Scanner(System.in);
        int i;
        for(i=1;i<=50;i++)
        {
        	sum=0;
        	for(int j=1;j<i;j++)
        	{
        		if(i%j==0)
        			sum=sum+j;
        	}
        	if(sum==i)
        		System.out.println(sum+ " is a perfect number");
        	sc.close();
        }
	}

}

