import java.util.*;

class multi extends Thread {
	int num;
	Thread t;
	multi(int a) {
		num = a;
		this.start();
	}
	public void run() {
	try {
		if(num<=5) {
			multi mt = new multi(num+1);
			this.sleep(1000/num);
			System.out.println("Thread " + num);
			
		}
	}
	catch(InterruptedException ie) {
		System.out.println("Not");
	}
	}
}

class new1 {
	public static void main(String args[]) {
		
			multi m = new multi(1);
		
	}
}
