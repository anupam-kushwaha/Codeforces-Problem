import java.util.Scanner;

public class Hulk {
	 
	static String loveHate(int n) {
		String love = "I love it";
		String hate = "I hate it";
		String love2 = "I love that";
		String hate2 = "I hate that";
		
		String res = "";
		for(int i = 1; i < n; i++) {
			if(i % 2 == 0) {
				res += love2;
			}else {
				res += hate2;
			}
			res += " ";
		}
		if(n % 2 == 0) {
			res = res + love;
		}else {
			res = res + hate;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(loveHate(n));
		sc.close();
	}
}
