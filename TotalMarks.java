package basicprogram;

import java.util.Scanner;
public class TotalMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float marks1,marks2,marks3,marks4,marks5,totalmarks,average,percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks1");
		marks1 =sc.nextFloat();
		System.out.println("Enter marks2");
		marks2 =sc.nextFloat();
		System.out.println("Enter marks3");
		marks3 =sc.nextFloat();
		System.out.println("Enter marks4");
		marks4 =sc.nextFloat();
		System.out.println("Enter marks5");
		marks5 =sc.nextFloat();

		totalmarks=marks1+marks2+marks3+marks4+marks5;
		System.out.println("Your total marks is:" +totalmarks);
		average= (totalmarks)/5;
		System.out.println("Your average is:" +average);
		percentage= (totalmarks/500)*100;
		System.out.println("Your percentage is:" +percentage);

		
		sc.close();
	}
        
}
