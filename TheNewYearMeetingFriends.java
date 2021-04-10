import java.util.Scanner;

public class TheNewYearMeetingFriends {
	
	static int findMiddle(int x, int y, int z) {
		if((x > y && x < z) || (x < y && x > z)) {
			return x;
		}
		if((y > x && y < z) || (y < x && y > z)) {
			return y;
		}
		if((z > y && z < x) || (z < y && z > x)) {
			return z;
		}
		return z;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, x3;
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		x3 = sc.nextInt();
		int small = findMiddle(x1, x2, x3);
		System.out.println(Math.abs(x1-small)+ Math.abs(x2-small) + Math.abs(x3-small));
		sc.close();
	}
}
