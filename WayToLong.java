import java.util.Scanner;

public class WayToLong {
	
	public static String findWayToLongWord(String s) {
		int len = s.length();
		if(len > 10) {
			 char start = s.charAt(0);
			 char end = s.charAt(len-1);
			String ret = Character.toString(start);
			ret = ret + (len-2);
			ret = ret.concat(Character.toString(end));
			return ret;
		}else {
			return s;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String [] str = new String[n];
		
		for(int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}
		sc.close();
		for(int i = 0; i < n; i++) {
			String ans = findWayToLongWord(str[i]);
			System.out.println(ans);
		}
	}
}
