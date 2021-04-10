import java.util.Arrays;
import java.util.Scanner;

public class Twins {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] values = new int[n];
		for(int i = 0; i < n; i++) {
			values[i] = sc.nextInt();
		}
		Arrays.sort(values);
		int totalSum = 0;
		for(int i = 0; i < n; i++)
			totalSum += values[i];
		
		int mySum = 0;
		int k = n-1;
		int mincoins = 0;
		while(k >= 0 && mySum <= (totalSum-mySum)) {
			mySum += values[k];
			k--;
			mincoins++;
		}
		System.out.println(mincoins);	
	}
}
