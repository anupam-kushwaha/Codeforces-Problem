import java.util.Scanner;
import java.util.Arrays;
public class BusinessTrip {
	
	static int findMinWateringMonth(int k, int[] arr) {
		Arrays.sort(arr);
		if(k == 0) {
			return 0;
		}
		
		int temp = 0, cnt = 0;
		for(int i = 11; i >= 0; i--) {
			temp += arr[i];
			cnt++;
			if(temp >= k) {
				break;
			}
		}
		if(temp < k) {
			return -1;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] arr = new int[12];
		for(int i = 0; i < 12; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findMinWateringMonth(k, arr));
	}
}
