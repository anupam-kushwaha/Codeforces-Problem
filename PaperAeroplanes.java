import java.util.Scanner;

public class PaperAeroplanes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double k = sc.nextDouble();
		double n = sc.nextDouble();
		double s = sc.nextDouble();
		double p = sc.nextDouble();
		long sheetPerPerson = (long)Math.ceil(n/s);
		
		long totalSheet = (long)k*sheetPerPerson; 
		int i = 1;
		while(((long)p * i) < totalSheet) {
			i++;
		}
		System.out.println(i);
		
		sc.close();
	}
}
