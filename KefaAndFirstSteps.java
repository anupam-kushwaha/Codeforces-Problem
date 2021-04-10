import java.util.Scanner;

public class KefaAndFirstSteps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cur = 0, prev = 0, maxNonDec = 0;
		int cnt = 0;
		do {
			cur = sc.nextInt();
			if(prev <= cur) {
				cnt++;
			}else {
				if(cnt > maxNonDec)
					maxNonDec = cnt;
				cnt = 1;
			}
			
			prev = cur;
			n--;
		}while(n > 0);
		if(cnt > maxNonDec) {
			maxNonDec = cnt;
		}
		
		System.out.println(maxNonDec);
		
		sc.close();
	}
}
