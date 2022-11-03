package basicprogram;

public class NumberOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char ch='1';
        if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
        		System.out.println(ch+ " is a vowel");
        
        else if((ch>=0)&&(ch<=9))
        	System.out.println(ch+ " is a number");
        else
        	System.out.println(ch+ " is a constant");
	}

}
//A=65 B=66 C=67
//a=97 b=98 c=99
//0-48 1=49
//'5'
//0 1 2 3 4 5 6 7 8 9