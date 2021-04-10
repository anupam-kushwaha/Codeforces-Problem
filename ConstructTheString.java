import java.util.Scanner;

public class ConstructTheString {
	
	static String getRandomString(int n) {
		String string = "abcdefghijklmnopqrstuvwxyz";
		StringBuffer sb = new StringBuffer(n);
		
		for(int i = 0; i < n; i++) {
			int index = (int)(string.length()*Math.random());
			sb.append(string.charAt(index));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			StringBuffer sb = new StringBuffer();
			Character ch = ' ';
			for(int i = 0; i < n; i++) {
				ch = (char)(97+(i % b));
				sb.append(ch);
			}
			System.out.println(sb);
			
		}
		
		sc.close();
		
	}
}
