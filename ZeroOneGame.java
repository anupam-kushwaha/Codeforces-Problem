import java.util.Scanner;

public class ZeroOneGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			String str = sc.next();
			int c0 = 0, c1 = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '1')
					c1++;
				else 
					c0++;
			}
			if(Math.min(c0, c1) % 2 == 1) {
				System.out.println("DA");
			}else {
				System.out.println("NET");
			}
		}
		sc.close();
	}
}
