package oopsconcepts;

class E
{
	public E()
	{
		System.out.println("this is default constructor");
	}
	public E(int j)
	{
		this();  //invoke default constructor
		System.out.println("the value of a is: "+ j);
	}
	public E(float k)
	{
		this(10);
		System.out.println("the value of b is: "+k);
	}
}
public class ThisConstructorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        E obj=new E(30.7f);
	}
}
