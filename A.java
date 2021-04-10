import java.util.Arrays;
import java.util.Scanner;

public class A {
	
	static boolean search(int[] arr, int start, int end, int key) {
		for(int i = start; i < end; i++) {
			if(arr[i] == key || arr[i] == (key + 1)) {
				return true;
			}
		}
		return false;
	}
	
	static String removeSmallest(int[] arr, int n) {
		int cnt = 0;
		if(n == 1) {
			return "YES";
		}
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {
			if(search(arr, i+1, n, arr[i])) {
				arr[i] = 0;
			}
		}
		for(int j = 0; j < n; j++) {
			if(arr[j] != 0) cnt++;
		}
		if(cnt == 1) {
			return "YES";
		}
		return "NO";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(removeSmallest(arr, n));
		}
		sc.close();
	}
}
