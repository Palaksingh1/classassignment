package basicprogram;

import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float principle,time,rate,si;   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle amount");
        principle =sc.nextFloat();
        System.out.println("Enter Time");
        time=sc.nextFloat();
        System.out.println("Enter Rate");
        rate=sc.nextFloat();
        
        si=(principle*time*rate)/100;
        
        //calculation simple interest
        System.out.println("Your simpele interest is:" +si);
        
        sc.close();
	}
}
//single line comment
/*multi line comments*/


