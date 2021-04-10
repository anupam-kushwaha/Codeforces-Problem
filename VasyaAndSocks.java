import java.util.Scanner;

public class VasyaAndSocks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int day = 0, i = 1;
		while(n != 0) {
			day++;
			if(day == (m*i)) {
				i++;
			}else {
				n--;
			}
		}
		System.out.println(day);
		
		sc.close();
	}
}
