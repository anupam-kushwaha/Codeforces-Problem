import java.util.Scanner;

public class Translation {
	
	static String checkReverse(String s, String t) {
		int n = t.length();
		if(s.length() != t.length()) {
			return "NO";
		}
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != t.charAt(n - 1 - i)) {
				return "NO";
			}
		}
		return "YES";
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		sc.close();
		System.out.println(checkReverse(s, t));
	}
}
