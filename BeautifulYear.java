import java.util.Scanner;

public class BeautifulYear {
	
	static boolean isDistinct(int y) {
		boolean[] visited = new boolean[10];	// digit of y will be kept
		while(y != 0) {
			if(visited[y % 10]) {	// if- true means already that digit is present
				break;				// so break it will not be unique digit num
			}
			visited[y % 10] = true;
			y /= 10;
		}
		if(y == 0) {
			return true;
		}
		return false;
	}
	
	static int findNextBeautifulYear(int y) {
		for(int i = y+1; i <= 9012; i++) {
			if(isDistinct(i)) {
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		sc.close();
		System.out.println(findNextBeautifulYear(y));
	}
}
