import java.util.Scanner;

public class DominoPiling {
	
	static int dominoNum(int m, int n) {
		double res = Math.floor(m*n*0.5);
		return (int)res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int ans = dominoNum(m, n);
		System.out.println(ans);
		
		sc.close();
	}
}
