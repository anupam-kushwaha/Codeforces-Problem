import java.util.Scanner;

public class BalancedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			if(n % 4 != 0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
				int j = 0;
				for(int i = 2; i <= n; i = i+2) {
						a[j] = i;
						j++;
				}
				int k = 0;
				for(int i = 1; k < n/2; i = i+2) {
					a[j] = i;
					j++; k++;
				}
				a[n-1] += n/2;									
				for(int i = 0; i < n; i++) {
					System.out.print(a[i] +" ");
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}
