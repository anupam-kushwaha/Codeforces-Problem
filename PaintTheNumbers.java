import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


public class PaintTheNumbers {
	
	static int findMin(ArrayList<Integer> arr) {
		int n = arr.size();
		int min = arr.get(0);
		for(int i = 0; i < n; i++) {
			if(arr.get(i) < min) {
				min = arr.get(i);
			}
		}
		return min;
	}
	
	static int findNumOfPaint(ArrayList<Integer> arr) {
		int n = arr.size();
		int color = 0;
		while(arr.isEmpty() == false) {
			int x = findMin(arr);
			color++;
			for(int i = 0; i < arr.size(); ) {
				if(arr.get(i) % x == 0) {
					arr.remove(i);
				}else {
					i++;
				}
			}
		}
		return color;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> arr;
		arr = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		int ans = findNumOfPaint(arr);
		System.out.println(ans);
	}
}






