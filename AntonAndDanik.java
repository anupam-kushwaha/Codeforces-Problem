import java.util.Scanner;

public class AntonAndDanik {
	
	static String whoWon(String s, int n) {
		int awon = 0;// anton won
		int dwon = 0;// danik won
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'A') {
				awon++;
			}
		}
		dwon = n - awon;
		if(awon > dwon) {
			return "Anton";
		}else if(awon < dwon) {
			return "Danik";
		}else {
			return "Friendship";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println(whoWon(s, n));
	}
}
