import java.util.Scanner;

public class Football {
	
	static String isDangerous(String str) {
		int n = str.length();
		int cnt = 1;
		char p = str.charAt(0);
		for(int i = 1; i < n; i++) {
			char curp = str.charAt(i);
			if(p == curp) {
				cnt++;
			}else {
				p = curp;
				cnt = 1;
			}
			
			if(cnt == 7) {
				break;
			}
		}
		if(cnt == 7) {
			return "YES";
		}
		return "NO";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isDangerous(str));
		
		sc.close();
	}
}
