import java.util.*;

class insuff extends Exception {
	String msg;
	insuff() { }
	insuff(String imsg) {
		msg = imsg;
	}
	public String toString() {
		return(msg+" cool");
	}
}

class bankme {
	Scanner scan = new Scanner(System.in);
	String accno,name;
	double balance,witamt,depamt;
	
	bankme() { }
	
	void getdata() {	
		System.out.println("Enter name: ");
		name = scan.next();
		System.out.println("Enter accno: ");
		accno = scan.next();
		System.out.println("Enter balance: ");
		balance = scan.nextDouble();
	}
	
	void deposit() {
		System.out.println("Enter deposit: ");
		depamt = scan.nextDouble();
		balance+=depamt;
		System.out.println("Deposited successfully ");
	}
	
	void withdrawal() throws insuff{
		System.out.println("Enter withdrawal: ");
		witamt = scan.nextDouble();
		if((balance-witamt)<0) {
			throw new insuff("Dont you dare");
		}
	   else {
			balance-=witamt;
		}	
	}
	
	void display() {
		System.out.println(name + " " + accno+ " "+balance);
	}
}


class banking {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int ch;
		bankme bk = new bankme();
		bk.getdata();
		do {
			System.out.println("Enter 1 to deposit 2 to withdraw 3 to display 4 to exit");
			ch = scan.nextInt();
			switch(ch) {
				case 1:bk.deposit();
					break;
				case 2:try {
						bk.withdrawal();
					}
					catch(insuff suf) {
						System.out.println(suf);
					}
					break;
				case 3:bk.display();
					break;
			}
		}while(ch!=4);
	}
}
			

		
