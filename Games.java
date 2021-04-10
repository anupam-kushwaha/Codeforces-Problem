import java.util.Scanner;

public class Games {
	
	static int findAnswer(int[] home, int [] guest) {
		int cnt = 0;
		int n = home.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(home[i] == guest[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] homeuniform = new int[n];
		int[] guestuniform = new int[n];
		
		for(int i = 0; i < n; i++) {
			homeuniform[i] = sc.nextInt();
			guestuniform[i] = sc.nextInt();
		}
		int ans = findAnswer(homeuniform, guestuniform);
		System.out.println(ans);
		sc.close();
	}
}
