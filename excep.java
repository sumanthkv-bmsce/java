import java.util.*;

class WrongAge extends Exception {
	String name;
	WrongAge(String iname) {
		name = iname;
	}
	
	public String toString() {
		return("Not a good data for " + name);
	}
	
}
class Father {
	int age1;
	Father() { }
	Father(int iage) throws WrongAge {
		age1 = iage;
		try {
			if(age1<0) {
				throw new WrongAge("Father");
			}
		else {
				System.out.println("Fine with father");
			}
	}
	catch(WrongAge wa) {
		System.out.println(wa);
	}
	}
}

class Son extends Father {
	int age2;
	Son() { }
	Son(int iage1,int iage2) throws WrongAge{
		super(iage1);	
		age2 = iage2;
	
		if(age2>age1) {
			throw new WrongAge("Father age less than son\n");
		}
		if(age2<0) {
			System.out.println("Sons age is negative");
		}
	else 
		System.out.println("Fine with Son ");
		
	}
	
}

class excep {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int flag=1,age1=0,age2=0;
		do {
		try {
			System.out.println("Enter fathers age");
			age1 = scan.nextInt();
			if(age1<=0) {
				throw new WrongAge("Father");
			}
		}
		catch(WrongAge wa) {
			System.out.println(wa);
			
		}
		}while(age1<=0);
		do {
		System.out.println("Enter sons age ");
		age2 = scan.nextInt();
		if(age2<=0) {
			System.out.println("sons age is negative");
		}
	else {
		try {
			Son s1 = new Son(age1,age2);
			}
		catch(WrongAge wa) {
			System.out.println("son's age is more than father's age");
		}
		}
	
		System.out.println("---------------------------------------------------------	");
	}while(age2>age1 || age2<=0);
	}
}
	
	
	
	
	
	
	
	
	
	
	

