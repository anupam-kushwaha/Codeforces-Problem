import java.util.Scanner;

public class ShortSubstrings {
	
	static StringBuffer findSecretString(String str) {
		StringBuffer  secret = new StringBuffer();
		secret.append(str.charAt(0));
		int len = str.length();
		for(int i = 1; i < len-1; i += 2) {
			secret.append(str.charAt(i));
		}
		secret.append(str.charAt(len-1));
		return secret;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String s;
		
		sc.nextLine();
		
		while(t-- > 0) {
			s = sc.nextLine();
			StringBuffer secret = findSecretString(s);
			System.out.println(secret);
		}
		
		sc.close();
	}
}
