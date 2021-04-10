import java.util.Scanner;

public class IWannaBeTheGuy {
	
	static boolean found(int level, int[] parr, int[] qarr) {
		boolean isFound = false;
		for(int i = 0; i < parr.length; i++) {
			if(level == parr[i]) {
				isFound = true;
			}
		}
		if(isFound) { // if found in parr , then return true
			return true;
		}else { // else search in qarr
			for(int i = 0; i < qarr.length; i++) {
				if(level == qarr[i]) {
					return true;
				}
			}
		}
		// if not found in parr or in qarr then return false
		return false;
	}
	
	static String canWinGame(int n, int p, int[] parr, int q, int[] qarr) {
		for(int i = 0; i < n; i++) {
			if( ! found(i+1, parr, qarr)) {
				return "Oh, my keyboard!";
			}
		}
		return "I become the guy.";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int p = sc.nextInt();
			int[] parr = new int[p];
			for(int i = 0; i < p; i++) {
				parr[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			int[] qarr = new int[q];
			for(int i = 0; i < q; i++) {
				qarr[i] = sc.nextInt();
			}
			
			System.out.println(canWinGame(n, p, parr, q, qarr));
			sc.close();
	}
}
