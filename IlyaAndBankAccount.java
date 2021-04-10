import java.util.Scanner;

public class IlyaAndBankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		
		if(n >= 10) {
			System.out.println(n);
		}else {
			long tn = Math.abs(n);
			long unit = tn % 10;
			long newNum = tn / 10;
			long tens = newNum % 10;
			n = (n / 100) * 10;
			if(unit < tens) {
				n += (-unit);
			}else {
				n = n + (-tens);
			}
			System.out.println(n);
		}
		sc.close();
	}
}
