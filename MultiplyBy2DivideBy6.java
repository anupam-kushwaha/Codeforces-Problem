import java.util.Scanner;

public class MultiplyBy2DivideBy6 {

	static int findMinMoves(int n) {
		int cnt = 0;
		if(n == 1) {
			return 0;
		}
		while(n >= 1) {
			if(n % 6 == 0) {
				n /= 6;
				
			}else {
				n *= 2;
			}
			cnt++;
			if(n == 1)
				return cnt;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int ans = findMinMoves(n);
			System.out.println(ans);
		}
	}
}
