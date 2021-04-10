import java.util.Scanner;

public class Elephant {
	
	static int findOptimalSteps(int x) {
		if(x <= 5) {
			return 1;
		}else {
			if(x % 5 == 0) return x/5;
			return x/5+1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		System.out.println(findOptimalSteps(x));
	}
}
