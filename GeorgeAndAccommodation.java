import java.util.Scanner;

public class GeorgeAndAccommodation {
	
	static int[] p = new int[100];
	static int[] q = new int[100];

	static int findNumOfRoom(int n) {
		int[] avail = new int[100];
		for(int i = 0; i < n; i++) {
			avail[i] = Math.abs(p[i]-q[i]);
		}
		
		int cnt = 0;
		for(int i = 0; i < avail.length; i++) {
			if(avail[i] >= 2) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n; i++) {
			p[i] = sc.nextInt();
			q[i] = sc.nextInt();
		}
		sc.close();
			
		System.out.println(findNumOfRoom(n));
	}
}
