import java.util.Scanner;

public class KanaAndDragonQuestGame {

	static String canDefeatDragon(int x, int n, int m) {
		int absor = 0, light = 0;
		while(n > 0 && m > 0) {
			absor = (int) Math.floor(x/2)+10;
			light = x-10;
			if(absor <= light) {
				x = absor;
				n--;
			}else {
				x = light;
				m++;
			}
			//......
			//System.out.println("absor:"+ absor +" light:"+ light +" x:"+ x);
			if(x <= 0) {
				return "YES";
			}
		}
		
		while(n > 0) {
			x = (int)Math.floor(x/2)+10;
			n--;
			//.........
			//System.out.println("absor:"+ absor +" light:"+ light +" x:"+ x);
			
			if(x <= 0) {
				return "YES";
			}
		}
		
		while(m > 0) {
			x = x - 10;
			m--;
			//...........
			//System.out.println("absor:"+ absor +" light:"+ light +" x:"+ x);
			
			if(x <= 0) {
				return "YES";
			}
		}
		return "NO";
	}

	static String solve(int x, int n, int m) {
		while(x > 0 && n > 0 && x/2+10 < x) {
			x = x/2+10;
			n--;
		}
		if(x <= m*10)
			return "YES";
		
		return "NO";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(solve(x, n, m));
		}
		sc.close();
	}
}
