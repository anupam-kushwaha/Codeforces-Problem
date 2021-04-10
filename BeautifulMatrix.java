import java.util.Scanner;

public class BeautifulMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int x = 0, y = 0;
		int i, j;
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				n = sc.nextInt();
				if(n == 1) {
					x = i;
					y = j;
					break;
				}
			}
			
		}
		sc.close();
		int ans = Math.abs(2-x)+ Math.abs(2-y);
		System.out.println(ans);
	}
}
