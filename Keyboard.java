import java.util.Scanner;

public class Keyboard {

	static String findOriginalMessage(char ch, String str) {
		String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
		String original = "";
		char[] carr = keyboard.toCharArray();
		if(ch == 'L') {
			for(int i = 0; i < str.length(); i++) {
				int index = keyboard.indexOf(str.charAt(i));
				original += carr[index+1];
			}
		}else {
			for(int i = 0; i < str.length(); i++) {
				int index = keyboard.indexOf(str.charAt(i));
				original += carr[index-1];
			}
		}
		
		return original;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str = sc.nextLine();
		char ch = s.charAt(0);
		System.out.println(findOriginalMessage(ch, str));
		
		sc.close();
	}
}
