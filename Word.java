import java.util.Scanner;

public class Word {
	static String solution(String s) {
		char[] ch = s.toCharArray();
		int lower = 0;
		int upper = 0;
		for(int i = 0; i < s.length(); i++) {
//			System.out.println(ch[i]);
			if(Character.isUpperCase(ch[i])) {
				upper++;
			}else {
				lower++;
			}
		}
//		System.out.println("Lower: "+ lower +"Upper: "+ upper);
		if(lower >= upper) {
			return s.toLowerCase();
		}
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
		
	}
}
