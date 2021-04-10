import java.util.Scanner;

public class NastyaAndRice {

	static void findAnswer(int n, int a, int b, int c, int d) {
		int L = n*(a-b);
		int R = n*(a+b);
		if(R < (c-d) || (c+d) < L) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i = 1;
		while(t-- > 0) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			findAnswer(n, a, b, c, d);
		}
	}
}
