import java.util.Scanner;

public class InsomniaCure {
	
	static int damagedDragon(int k, int l, int m, int n, int d) {
		int cnt = 0;
		boolean[] visited = new boolean[d];
		int[] arr = {k, l, m, n};
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < d; j++) {
				if(! visited[j]) {
					if((j+1) % arr[i] == 0 ) {
						visited[j] = true;
					}
				}
			}
		}
		for(int i = 0; i < d; i++) {
			if( visited[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println(damagedDragon(k, l, m, n, d));
		sc.close();
	}
}
