import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ArrivalOfTheGeneral {
	
	static int minTimeTaken(Integer[] height, int n) {
		int t = 0; 
		int min = Collections.min(Arrays.asList(height));
		int max = Collections.max(Arrays.asList(height));
		int minIndex = 0, maxIndex = 0;
		
//		System.out.println("min:"+ min +" max:"+ max);
		
		for(int i = 0; i < height.length; i++) {
			if(height[i] == min) {
				minIndex = i;
			}
			if(height[i] == max) {
				maxIndex = i;
			}
		}
		
		while((minIndex != n-1) && (maxIndex != 0)) {
			t++;
			minIndex++;
			maxIndex--;
		}
		while(minIndex != n-1) {
			t++;
			minIndex++;
		}
		while(maxIndex != 0) {
			t++; maxIndex--;
		}
		return t;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] height = new Integer[n];
		for(int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}
		System.out.println(minTimeTaken(height, n));
		sc.close();
	}
}
