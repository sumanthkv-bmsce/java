import java.util.*;
class sgpa
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int totalcredits=0,i;
		int marks[]=new int[n];
		int credits[]=new int[n];
		int grades[] = new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the subject marks: ");
			marks[i]=scan.nextInt();
			credits[i]=scan.nextInt();
			totalcredits+=credits[i];
			if(marks[i]>=90 && marks[i]<=100)
			{
				grades[i] = 10;
			}
		else if(marks[i]>=75 && marks[i]<90){
			grades[i] = 9;
		   }
		else if(marks[i]>=60 && marks[i]<75){
			grades[i] = 8;
		   }
		else if(marks[i]>=50 && marks[i]<60){
			grades[i] = 7;
		   }
		else if(marks[i]>=45 && marks[i]<50){
			grades[i] = 5;
		   }
		else if(marks[i]>=40 && marks[i]<45){
			grades[i] = 4;
		   }
		else {
			grades[i]=0;
		  }
	}
	int total=0;
	for(i=0;i<n;i++)
	{
		total = total+(grades[i]*credits[i]);
	}
	double sgpa = (double)total/totalcredits;
	System.out.println(sgpa);
 }
}
		

		
		