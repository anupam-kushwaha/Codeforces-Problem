import java.util.Scanner;

public class Magnets {
	
	static int findGroup(int[] mag, int n) {
		int cnt = 1;
		int prev = mag[0];
		for(int i = 1; i < mag.length; i++) {
			if(prev != mag[i]) {
				cnt++;
				prev = mag[i];
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] magnets = new int[n];
		for(int i = 0; i < n; i++) {
			magnets[i] = sc.nextInt();
		}
		System.out.println(findGroup(magnets, n));
		sc.close();
	}
}
