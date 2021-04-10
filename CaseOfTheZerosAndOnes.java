import java.util.Scanner;

public class CaseOfTheZerosAndOnes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		int cnt0 = 0, cnt1 = 0;
		for(int i = 0; i < n; i++) {
			if(str.charAt(i) == '1') {
				cnt1++;
			}else {
				cnt0++;
			}
		}
		System.out.println(Math.abs(cnt1-cnt0));
	}
}
