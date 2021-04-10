import java.util.Scanner;

public class NewYearAndHurry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int time = 0, ans = 0;
		for(int i = 1; i <= n; i++) {
			time += 5*i;
			if((k + time) <= 240) {
				ans = i;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}
}
