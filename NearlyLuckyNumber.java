import java.util.Scanner;
public class NearlyLuckyNumber {
	
	static String isLuckyNumber(long n) {
		long cnt = 0;
		while(n > 0) {
			long r = n % 10;
			if(r == 4 || r == 7) {
				cnt = cnt + 1;
			}
			n /= 10;
		}
//		System.out.println("cnt :"+ cnt);
//		boolean is47;
//		while(cnt > 0) {
//			is47 = false;
//			long rem = cnt % 10;
//			System.out.println("rem :"+ rem);
//			if(rem == 4 || rem == 7) {
//				is47 = true;
//			}
//			if(!is47) {
//				return "NO";
//			}
//			cnt /= 10;
//		}
//		if(cnt == 0) {
//			return "NO";
//		}
//		return "YES";
		
		if(cnt > 0 && (cnt == 4 || cnt == 7)) {
			return "YES";
		}else {
			return "NO";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		System.out.println(isLuckyNumber(n));
	}
}
