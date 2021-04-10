import java.util.Scanner;

public class Drinks {
	
	static double solve(double[] p, int n) {
		double avg = 0;
		for(int i = 0; i < n; i++) {
			avg += p[i];
		}
		avg /= (double)n;
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] p = new double[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextDouble();
		}
		
		System.out.println(solve(p, n));
		sc.close();
	}
}
