import java.util.Scanner;

public class BitPlusPlus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			String stat = sc.nextLine();
			
			char[] ch = stat.toCharArray();
			if(ch[0] == '-') {
				cnt--;
			}
			if(ch[0] == '+')
				cnt++;
			
		
			if(ch[2] == '+')
				cnt++;
			if(ch[2] == '-')
				cnt--;
		}
		sc.close();
		System.out.println(cnt);
	}
}
