import java.util.Scanner;

public class WordCapitalization {
	static String wordCapital(String word) {
		Character ch = word.charAt(0);
		ch = Character.toUpperCase(ch);
		String ord = word.substring(1);
		return ch + ord;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String ans = wordCapital(word);
		System.out.println(ans);
		sc.close();
	}
}
