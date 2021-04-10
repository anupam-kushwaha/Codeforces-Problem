import java.util.Scanner;

public class QueueAtTheSchool {
	
	static String s;
	
	static void changeQueue() {
		char[] ch = s.toCharArray();
		char[] tempCh = s.toCharArray();
		for(int i = 0; i < s.length()-1; i++) {
			if((tempCh[i] == 'B') && (tempCh[i+1] == 'G')) {
				ch[i] = 'G';
				ch[i+1] = 'B';
			}
		}
		s = toString(ch);
	}
	
	public static String toString(char[] a) {
		String string = String.valueOf(a);
		return string;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		sc.nextLine();
		s = sc.nextLine();
		for(int i = 0; i < t; i++) {
			changeQueue();
		}
		sc.close();
		System.out.println(s);
		
		
	}
}
