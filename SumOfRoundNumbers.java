import java.util.Scanner;

public class SumOfRoundNumbers {
	
	static int findDistDigit(int n) {
		int res = 0;
		int r = 0;
		while(n != 0) {
			r = n % 10;
			n /= 10;
			if(r != 0) res++;
		}
		return res;
	}
	
	static int[] findSummands(int n, int k) {
		int [] summands = new int[k];
		
		int r = 0;
		int times = 1;
		int i = 0;
		
		while(n != 0) {
			r = n % 10;
			n /= 10;
			if(r != 0) {
				summands[i] = r*times;
				i++;
			}
			times *= 10;
		}
		return summands;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int[] n = new int[t];
		for(int i = 0; i < t; i++) {
			n[i] = sc.nextInt();
		}
		
		for(int i = 0; i < t; i++) {
			int k = findDistDigit(n[i]);
			int[] summands = findSummands(n[i], k);
			System.out.println(k);
			for(int j = 0; j < k; j++) {
				System.out.print(summands[j] +" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
