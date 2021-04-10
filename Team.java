import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int temp = 0;
			for(int j = 0; j < 3; j++) {
				int sol = sc.nextInt();
				temp += sol;
			}
			if(temp > 1) cnt++;
		}
		sc.close();
		System.out.println(cnt);
	}
}
