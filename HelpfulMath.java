import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String newStr = "";
		char[] chArr = str.toCharArray();
		Arrays.sort(chArr);
		for(int i = 0; i < str.length(); i++) {
			if(chArr[i] == '+') continue;
			newStr += chArr[i];
			if(i != chArr.length-1) 
				newStr += '+';
		}
		System.out.println(newStr);
	}
}
