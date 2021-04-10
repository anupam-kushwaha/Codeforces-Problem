import java.util.Scanner;

public class GiftsFixing {
	
	static long sumOfArray(long[] arr) {
		long sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static long minOfArray(long[] arr) {
		long small = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < small) {
				small = arr[i];
			}
		}
		return small;
	}
	
	static long max(long a, long b) {
		if(a >= b) {
			return a;
		}else {
			return b;
		}
	}
	
	static long movesToEqualise(long[] a, long[] b, long n) {
		long minA = minOfArray(a);
		long minB = minOfArray(b);
		for(int i = 0; i < n; i++) {
			a[i] -= minA;
			b[i] -= minB;
		}
		long moves = 0;
		for(int i = 0; i < n; i++) {
			moves += max(a[i], b[i]);
		}
		return moves;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t-- > 0) {
			int n = sc.nextInt();
			long[] a = new long[n];
			long[] b = new long[n];
			
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}
			for(int i = 0; i < n; i++) {
				b[i] = sc.nextLong();
			}
			System.out.println(movesToEqualise(a, b, n));
		}
		sc.close();
	}
}
