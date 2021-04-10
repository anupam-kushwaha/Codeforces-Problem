import java.util.Scanner;
import java.util.HashSet;

public class IsYourHorseShoeOnTheOtherHoof {
	
	static int numOfSameShoe(Long s1, Long s2, Long s3, Long s4) {
		int cnt = 0;
		HashSet<Long> set = new HashSet<>();
		
		for(int i = 0; i < 4; i++) {
			set.add(s1);
			set.add(s2);
			set.add(s3);
			set.add(s4);
		}
		cnt = 4 - set.size();
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long s1 = sc.nextLong();
		Long s2 = sc.nextLong();
		Long s3 = sc.nextLong();
		Long s4 = sc.nextLong();
		int n = numOfSameShoe(s1, s2, s3, s4);
		System.out.println(n);
		sc.close();
	}
}
 