import java.util.Scanner;
import java.util.Arrays;

public class Puzzles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no of students
		int m = sc.nextInt(); // puzzles shopkeeper has
		int [] f = new int[m];
		
		for(int i = 0; i < m; i++) {
			f[i] = sc.nextInt();
		}
		
		Arrays.sort(f);
		int best = Integer.MAX_VALUE;
		for(int i = 0; i <= m-n; i++) {
			best = Integer.min(best, f[i+ n-1]-f[i]);
		}
		System.out.println(best);
		sc.close();
	}
}
