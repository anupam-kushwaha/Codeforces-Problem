import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = 0, k = 0;
		
		while(t-- > 0) {
			n = sc.nextInt();
			k = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int i = 0, j = n-1;
			while(k-- > 0) {
				if(a[i] < b[j]) {
					int temp = a[i];
					a[i] = b[j];
					b[j] = temp;
				}
				i++; j--;
			}
			int maxSum = 0;
			for(int l = 0; l < n; l++) {
				maxSum += a[l];
			}
			System.out.println(maxSum);
		}
		
		sc.close();
	}
}
