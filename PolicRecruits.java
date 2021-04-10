import java.util.Scanner;

public class PolicRecruits {
	
	static int crimeRemainUntreated(int[] events) {
		int n = events.length;
		int crime = 0;
		int policeAvailable = 0;
		for(int i = 0; i < n; i++) {
			if(events[i] == -1) {
				if(policeAvailable > 0) {
					policeAvailable--;
				}else {
					crime++;
				}
			}else {
				policeAvailable += events[i];
			}
		}
		return crime;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] events = new int[n];
		for(int i = 0; i < n; i++) {
			events[i] = sc.nextInt();
		}
		int ans = crimeRemainUntreated(events);
		System.out.println(ans);
		
		sc.close();
	}
}
