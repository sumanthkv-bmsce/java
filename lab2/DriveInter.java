import java.util.*;

interface drive1 {
	int safe_spd = 80;
	void act_spd();
}

class drive implements drive1 {
	Scanner scan = new Scanner(System.in);
	double act;
	static int count1=0;
	static int count2=0;
	public void act_spd() {
		System.out.println("getting from u");
		act = scan.nextDouble();
	}
	
	void display() {
		if(act>safe_spd) {
			System.out.println("Drive Slow idiot");
			count1++;
		}
	else  {
		System.out.println("Good going");
		count2++;
	}
	}
}

class DriveInter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int ch;
		drive d = new drive();
		do {
			System.out.println("enter 1 to get real_time_data 2 to stop");
			ch = scan.nextInt();
			switch(ch) {
				case 1: d.act_spd();
					d.display();
					break;
				case 2: System.out.println("U reached ur destination");
					if(d.count1>d.count2) {
						System.out.println("obey traffic rules idiot");
					}
				else {
					System.out.println("Peacefull journey so far");
				}
					break;
			}
		}while(ch!=2);
					
	}
}
