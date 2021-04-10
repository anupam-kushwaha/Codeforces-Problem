import java.util.Scanner;

public class FoodBuying {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int s = sc.nextInt();
			int ans = 0;
			int pw = 1000 * 1000 * 1000;
			
			while(s > 0) {
				while(s < pw) {
					pw /= 10;
				}
				ans += pw;
				s -= pw - pw/10;
			}
			System.out.println(ans);
		}
	}
}
