import java.util.Scanner;

public class UltraFastMathematician {
	
	static long findNewNumber(Long num1, Long num2) {
		String str1 = num1.toString();
		String str2 = num2.toString();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < str1.length(); ++i) {
			System.out.println(i +"# "+ str1.charAt(i));
		}
		for(int i = 0; i < str1.length()-1; i++) {
			sb.append(str1.charAt(i)^str2.charAt(i)); // taking XOR of value a i
		}
		System.out.println(sb);
		Long res = Long.parseLong(sb.toString());
		return res;
 	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long num1 = sc.nextLong();
		Long num2 = sc.nextLong();
		
		Long ans = findNewNumber(num1, num2);
		System.out.println(ans);
		sc.close();
	}
}
