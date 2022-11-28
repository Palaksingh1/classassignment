package oopsconcepts;

class a
{
	void a()
	{
		System.out.println("class a method");
	}
}
class b extends a
{
	void b()
	{
		System.out.println("class b method");
	}
}

interface c
{
	void c();
}

class d extends b implements c
{
	
	@Override
	public void c()
	{
		System.out.println("interface c method");
		
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        d obj=new d();
        obj.a();
        obj.b();
        obj.c();
	}

}
