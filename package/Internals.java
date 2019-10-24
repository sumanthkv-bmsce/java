package CIE;
import java.util.*;
import SEE.External;
public class Internals extends External
{
	Scanner scan=new Scanner(System.in);
	public double arr[];
	public 
	int n;
	public void getdata()
	{
		arr = new double[5];
		for(int i=0;i<5;i++)
		{
			arr[i] = scan.nextDouble();
		}
	}
}
	
