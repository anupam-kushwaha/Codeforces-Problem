import java.util.Scanner;
public class InSearchOfAnEasyProblem {
	
	static String findEasyOrHard(int[] a, int n) {
		int i = 0;
		while(n-- > 0) {
			if(a[i] == 1) {
				return "HARD";
			}
			i++;
		}
		
		return "EASY";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(findEasyOrHard(a, n));
	}
}
