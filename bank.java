import java.util.*;
import java.lang.*;

class Account
{
	String name;
	int accno;
}

class Curr_acc extends Account
{
	Scanner scan = new Scanner(System.in);
	double balance=500,amt,withdraw;
	/*System.out.println("Enter name: ");
	name = scan.next();
	System.out.println("Enter accno: ");
	accno = scan.nextInt();*/
	void deposit()
	{
		System.out.println("Enter amt: ");
		amt = scan.nextInt();
		balance+=amt;
	}
	void display()
	{
		System.out.println("total balance is "+balance);
	}
	void interest()
	{
		System.out.println("NO interest ");
	}
	void permit()
	{
		if(balance>=2000)
		{
			System.out.println("Permittable ");
			System.out.println("enter withdrawal amt");
			withdraw = scan.nextDouble();
			if(balance-withdraw<0)
			{
				System.out.println("Negative");
			}
		else {
			balance-=withdraw;
		}
		}
	else {
		System.out.println("Cant withdraw includes service charge");
		balance -=(0.05*balance);
		System.out.println(balance);
		
	}
	}
}

class Sav_acc extends Account
{
	Scanner scan = new Scanner(System.in);	
	double balance=500,amt,withdraw,rate,interest,flag=1;
	int months;
	/*System.out.println("Enter name: ");
	name = scan.next();
	System.out.println("Enter accno: ");
	accno = scan.nextInt();	*/	
	void deposit()
	{
		System.out.println("Enter amt: ");
		amt = scan.nextInt();
		balance+=amt;
	}
	void display()
	{
		System.out.println("balance is "+balance);
	}
	void compound()
	{
		rate=5;
		System.out.println("Months is ");
		months = scan.nextInt();
		interest = balance*Math.pow(((rate/100)),months);
		if(flag==1)
		{
			balance+=interest;
			flag=0;
		}
		System.out.println("total balance is for 5% CI is "+balance);
			
	}
	void permit()
	{
		if(balance>=2000)
		{
			System.out.println("Permittable ");
			System.out.println("enter withdrawal amt");
			withdraw = scan.nextDouble();
			if(balance-withdraw<0)
			{
				System.out.println("Negative");
			}
		else {
			balance-=withdraw;
		}
		}
	else {
		System.out.println("Cant withdraw includes service charge");
		System.out.println("NotPermittable "+balance);	
	}
	}
}

class Bank
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int ch,ch1;
		double amt;
		do
		{
			System.out.println("Enter 1 to current\n2 to savings\n3 to exit ");
			ch = scan.nextInt();
			switch(ch)
			{
				case 1:	Curr_acc c = new Curr_acc();
					do {
						System.out.println("Enter 1 to deposit\n2 to  display \n3 to interest\n4 to permit");
						ch1 = scan.nextInt();
						switch(ch1) {
							case 1:c.deposit();
							break;
							case 2:c.display();
							break;
							case 3:c.interest();
							break;
							case 4:c.permit();
							break;
							case 5:System.out.println("Invalid");
							break;
						}
							
					}while(ch1<=4);
					break;
				case 2:Sav_acc s = new Sav_acc();
					do {
						System.out.println("Enter 1 to deposit\n2 to  display\n3 to interest\n4 to permit");
						ch1 = scan.nextInt();
						switch(ch1) {
							case 1:s.deposit();
							break;
							case 2:s.display();
							break;
							case 3:s.compound();
							break;
							case 4:s.permit();
							break;
							case 5:System.out.println("Invalid");
							break;
						}	
					}while(ch1<=4);
					break;
				case 3:System.out.println("Invalid");
					break;
			}
		}while(ch<=2);
	}
}
				
				
							
				

	
	
	
