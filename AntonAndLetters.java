import java.util.Scanner;
import java.util.HashSet;

public class AntonAndLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashSet<Character> set = new HashSet<>();
		
		for(int i = 1; i < s.length()-1; i = i+3) {
			set.add(s.charAt(i));
		}

		System.out.println(set.size());
		sc.close();
	}
}
