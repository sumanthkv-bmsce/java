import java.util.*;

class sort extends Thread {
	Scanner scan = new Scanner(System.in);
	int arr1[],n,temp,arr2[],j=0;
	sort(int in) {
		n = in; 
		arr1 = new int[n];
		arr2 = new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			arr1[i] = scan.nextInt();
			arr2[j] = arr1[i];
			j++;
		}
		this.start();
	}
	public void run() {
	try {
		for(int i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(arr1[i]>arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
			System.out.println("arr1-" + arr1[i]);
			Thread.sleep(1000);
		}
	}
	catch(InterruptedException ie) {
		}
	}
}

class list {
	public static void main(String args[]) {
		sort s1;                                 
		int n1,temp,n2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		n2 = scan.nextInt();
		n1 = n2;
		sort s2 = new sort(n2);
		s1 = s2;
		
		try {
		for(int z=0;z<n1;z++) {
			for(int x = z+1;x<n1;x++) {
				if(s1.arr2[z]<s1.arr2[x]) {
					temp = s1.arr2[z];
					s1.arr2[z] = s1.arr2[x];
					s1.arr2[x] = temp;
				}
			}
			System.out.println("arr2-" + s1.arr2[z]);
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException ie) {
		}
		System.out.println("\n");
	}
}
		
			
		
