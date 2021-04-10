import java.util.Scanner;

public class Tram {
	
	static int maxCapacity(int[] a, int[] b, int n) {
		int maxCapacity = a[0];
		int totalPassInTrain = 0;
		for(int i = 0; i < n; i++) {
			totalPassInTrain += b[i] - a[i];
			if(maxCapacity < totalPassInTrain) {
				maxCapacity = totalPassInTrain;
			}
		}
		return maxCapacity;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[1000];
		int[] b = new int[1000];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(maxCapacity(a, b, n));
	}
}
 