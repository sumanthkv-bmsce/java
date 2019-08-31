import java.util.*;
import java.lang.*;
import java.io.*;

class sqrt
{
	public static void main (String[] args)
	{
	    Scanner scan = new Scanner(System.in);
            double a = scan.nextInt();
            double b = scan.nextInt();
            double c = scan.nextInt();
            double d = (b*b)-(4*a*c);
            if(d==0) {
                double r1 = -b/(2*a);
                double r2 = r1;
                System.out.println(r1);
                System.out.println(r2);
            }
        else if(d>0) {
            double r1 = (-b+Math.sqrt(d))/(2*a);
            double r2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println(r1);
            System.out.println(r2);
        }
    else {
        double part = -b/(2*a);
        double r1 = (Math.sqrt(-d))/(2*a);
        System.out.println(part+" + i"+r1);
        System.out.println(part+" - i"+r1);

    }
	}
}
