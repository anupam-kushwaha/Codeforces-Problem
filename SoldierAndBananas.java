import java.util.Scanner;

public class SoldierAndBananas {
	static int findBorrowedMoney(int k, int n, int w) {
		int total = 0;
		for(int i = 1; i <= w; i++) {
			total += i*k;
		}
		int borrow = total - n;
		if(borrow < 0) {
			return 0;
		}else {
			return borrow;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		System.out.println(findBorrowedMoney(k, n, w));
		sc.close();
	}
}
