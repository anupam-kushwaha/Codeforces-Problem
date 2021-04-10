import java.util.Scanner;

public class FoxAndSnake {
	
	static void printSnake(int n, int m) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				boolean haveSnake = true;
				if(i % 2 == 1) haveSnake = true;
				else {
					if(i % 4 == 2) { haveSnake = (j == m);}
					if(i % 4 == 0) { haveSnake = (j == 1);}
				}
				System.out.print((haveSnake)? "#":".");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		printSnake(n, m);
		
		sc.close();	
	}
}
