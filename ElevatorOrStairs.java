import java.util.Scanner;

public class ElevatorOrStairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		
		int elevTime = 0, stairTime = 0;
		elevTime = Math.abs(x-y)*t2 + Math.abs(x-z)*t2 + t3*3;
		stairTime = Math.abs(x-y)*t1;
		
		System.out.println(stairTime < elevTime ? "NO" : "YES");
		
		sc.close();
	}
}
