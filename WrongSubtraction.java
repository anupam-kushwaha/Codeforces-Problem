import java.util.Scanner;

public class WrongSubtraction {
	
	static int findResult(int n, int k) {
		while(k-- > 0) {
			if(n % 10 == 0) {
				n /= 10;
			}else {
				n -= 1;
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		System.out.println(findResult(n, k));
	}
}
