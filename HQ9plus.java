import java.util.Scanner;

public class HQ9plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		boolean willPrint = false;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'H' || c == 'Q' || c == '9') {
				willPrint = true;
				break;
			}
		}
		
		if(willPrint == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		sc.close();
			
	}
}
