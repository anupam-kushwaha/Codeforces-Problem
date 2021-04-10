import java.util.Scanner;

public class PetyaAndString {
	static int cmpStr(String str1, String str2) {
		if(str1.compareToIgnoreCase(str2) < 0) {
			return -1;
		}else if(str1.compareToIgnoreCase(str2) > 0) {
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		int ans = cmpStr(str1, str2);
		System.out.println(ans);
	}
}