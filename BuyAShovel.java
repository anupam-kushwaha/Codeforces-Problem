import java.util.Scanner;

public class BuyAShovel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int r = sc.nextInt();
		int i = 0; // number of shovel he can buy
		boolean canExit = true;
		while(canExit) {
			i++;
			if(((i * k) % 10 == 0) || (i * k) % 10 == r) {
				canExit = false;
			}
		}
		System.out.println(i);
		
		sc.close();
	}
}
