import java.util.Scanner;

public class Presents {
	
	static int[] solve(int[] arr, int n) {
		int[] q = new int[n];
		int temp;
		for(int i = 0; i < n; i++) {
			// [2 3 4 1]
			// [4 1 2 3]
			temp = arr[i];
			q[temp-1] = i+1;
		}
		return q;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		
		int[] ans= solve(p, n);
		for(int i = 0; i < n; i++) {
			System.out.print(ans[i] +" ");
		}
	}
}
