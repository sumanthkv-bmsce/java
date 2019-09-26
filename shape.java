import java.util.*;

abstract class sh
{
	int x;
	abstract void printArea();
}
class Rect extends sh
{
	int y;
	Rect()
	{	}
	Rect(int a,int b)
	{
		x = a;
		y = b;
	}
	void printArea()
	{
		float res = (float)x*y;
		System.out.println(res);
	}
}

class Tria extends sh
{
	int y;
	Tria()
	{	}
	Tria(int a,int b)
	{	
		x = a;
		y = b;
	}
	void printArea()
	{
		float res = (float)0.5*x*y;
		System.out.println(res);
	}
}

class Cir extends sh
{
	Cir()
	{	}
	Cir(int a)
	{
		x = a;
	}
	 void printArea()
	{
		float res = (float)3.142*x*x;
		System.out.println(res);
	}

}

class shape
{
	public static void main(String args[])
	{
		int p,q,ch;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter 3 to circle 2 to triangle 1 to rectangle");
			ch = scan.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter a and b");
					p = scan.nextInt();
					q = scan.nextInt();
					Rect r = new Rect(p,q);
					r.printArea();
					break;
				case 2:System.out.println("Enter a and b");
					p = scan.nextInt();
					q = scan.nextInt();
					Tria t = new Tria(p,q);
					t.printArea();
					break;
				case 3:System.out.println("Enter a ");
					p = scan.nextInt();
					Cir c = new Cir(p);
					c.printArea();
					break;
				case 4:
					break;
			}
		}while(ch<=4);
	}
}
		 





