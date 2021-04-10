import java.util.Scanner;

public class NextRound {
	
	public static int findAdv(int n, int k, int [] score) {
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(score[i] >= score[k-1] && score[i] != 0) cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
	
		int [] score = new int[n];
	
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		int adv = findAdv(n, k, score);
		System.out.println(adv);
	}	
}
