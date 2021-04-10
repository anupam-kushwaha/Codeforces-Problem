import java.util.Scanner;

public class StonesOnTheTable {
	static int findStoneToPick(String str, int n) {
		int cnt = 0;
		char[] ch = str.toCharArray();
		for(int i = 0; i < str.length()-1; i++) {
			if(ch[i] == ch[i+1]) {
				++cnt;
			}else {
				continue;
			}
		}
		return cnt;
	}
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String stoneColor = sc.nextLine();
		int ans = findStoneToPick(stoneColor, n);
		System.out.println(ans);
		sc.close();
	}
}
