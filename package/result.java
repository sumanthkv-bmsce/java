//package result;

import CIE.Student;
import CIE.Internals;
import SEE.External;
import java.util.*;
class result
{
	public static void main(String args[])
	{
		double res;
		Scanner scan = new Scanner(System.in);
		int n,j;
		System.out.println("Enter n: ");
		n = scan.nextInt();
		Internals ie[] = new Internals[n];
		External ex[] = new External[n];
		for(j=0;j<n;j++)
		{
			ie[j] = new Internals();
			ex[j] = new External();
			System.out.println("Student "+(j+1));
			ex[j].getdata();
			ex[j].setdata();
			System.out.println("Enter the iemarks: ");
			ie[j].getdata();
			for(int i=0;i<5;i++)
			{
				System.out.println("Total marks is: "+ (ex[j].earr[i]+ie[j].arr[i]));
			}
			System.out.println("------------------------------------------------------------");
		}
	}
}
			
