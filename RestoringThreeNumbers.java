import java.util.Scanner;

public class RestoringThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[4];
		for(int i = 0; i < 4; i++) {
			nums[i] = sc.nextInt();
		}
		int large = nums[0];
		int lindex = 0;
		for(int i = 1; i < 4; i++) {
			if(nums[i] > large) {
				large = nums[i];
				lindex = i;
			}
		}
		for(int i = 0; i < 4; i++) {
			if(i != lindex) {
				System.out.print((large-nums[i]) +" ");
			}
		}
		sc.close();
	}
}
