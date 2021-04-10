import java.util.Scanner;

public class EvenOdds {
	
	static long findNewPosElement(long n, long k) {
		int cnt=0;
		if((n&1) == 1) { // if odd
			for(int i=1; i<=n; i+=2) {
				cnt++;
				if(cnt == k) {
					return i;
				}
			}
			for(int i=2; i<=n-1; i+=2) {
				cnt++;
				if(cnt == k) {
					return i;
				}
			}
		}else {
			for(int i=1; i<=n-1; i+=2) {
				cnt++;
				if(cnt == k) {
					return i;
				}
			}
			for(int i=2; i<=n; i+=2) {
				cnt++;
				if(cnt == k) {
					return i;
				}
			}
		}
		return 0;
	}
	
	
	static long find(long n, long k) {
		if((n & 1) == 1) {
			if(k <= ((n+1)/2)) {
				return 2*k-1;
			}else {
				k -= (n+1)/2;
				return 2*k;
			}
		}else {
			if(k <= (n/2)) {
				return 2*k-1;
			}else {
				k -= n/2;
				return 2*k;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		System.out.println(find(n, k));
		
		sc.close();
	}
}
