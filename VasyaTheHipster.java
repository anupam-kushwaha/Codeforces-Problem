import java.util.Scanner;

public class VasyaTheHipster {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int maxFaishonDay = 0, sameSockDay = 0;
		if(a > b) {
			maxFaishonDay = b;
			int rem = a-b;
			sameSockDay = rem / 2;
		}else {
			maxFaishonDay = a;
			int rem = b-a;
			sameSockDay = rem / 2;
		}
		
		System.out.println(maxFaishonDay +" "+ sameSockDay);
		sc.close();
	}
}
