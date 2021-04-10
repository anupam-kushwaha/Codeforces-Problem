import java.util.Scanner;

public class DesignTutorial {
	static int cnt = 0;
	static boolean isComposit(int n) {
		cnt++;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 4; i < n; i++) {
			if(isComposit(i) && isComposit(n-i)) {
				System.out.println(i +" "+ (n-i));
				break;	
			}
		}
		sc.close();
		//System.out.println("call:"+ cnt);
	}
}
