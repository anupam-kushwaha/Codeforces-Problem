import java.util.Scanner;

public class MemoryAndCrow {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int j = 0; j < n-1; j++) {
			System.out.print(b[j]+b[j+1] +" "); 
		}
		System.out.print(b[n-1]);
	}
}
