import java.util.Scanner;

public class Candies {
	
	static void findX(int n) {
		int temp = 0;
		for(int k = 2; k <= 29; k++) {
			temp = ((int)(Math.pow(2, k)) - 1);
			if(n % temp == 0) {
				System.out.println(n / temp);
				break;
					
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			findX(n);
		}
	}
}
