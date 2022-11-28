package oopsconcepts;
//we can instantiate interface but we can create reference variable of interface 
interface MyInterface
{
	public void method1();
	int x=23;
}

interface Drawable extends MyInterface
{
	public void draw();
//	public void method1();
	int x=100;
}
interface AA
{
	public void draw();
	int x=200;
}

class demoo implements Drawable,AA
{
	@Override
	public void method1()
	{
		System.out.println("Overridden method of interface");
		//x=30;
	}
	
	@Override
	public void draw()
	{
		System.out.println("drawing circle");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        demoo obj=new demoo();  //upcasting
        obj.method1();
        obj.draw();
        System.out.println(Drawable.x);
	}

}
