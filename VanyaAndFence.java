import java.util.Scanner;
public class VanyaAndFence {
	
	static int findMinValidWidth(int[] a, int n, int h) {
		int minHeight = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] > h) {
				minHeight += 2;
			}else {
				minHeight += 1;
			}
		}
		return minHeight;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		long start = System.currentTimeMillis();
		System.out.println(findMinValidWidth(a, n, h));
		long end = System.currentTimeMillis();
		System.out.println("Time Taken: "+ (end-start) +"ms");
	}
}
