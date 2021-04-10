import java.util.Scanner;
import java.util.HashMap;
public class BoyOrGirl {
	static String findGender(String s) {
		char[] ch = s.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			map.put(ch[i], 1);
		}

		if(map.size() % 2 == 0) {
			return "CHAT WITH HER!";
		}
		return "IGNORE HIM!";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(findGender(sc.nextLine()));
		sc.close();
	}
}
