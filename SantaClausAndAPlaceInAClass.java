import java.util.Scanner;

public class SantaClausAndAPlaceInAClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int place = 1;
		int row = 1, col = 1, i = 1;
		while(place != k) {
			col = col % (n+1);
			row = row % (m+1);
			
			if(place == 2 * m * i) {
				col++;
				row = 0;
				i++;
			}
			if(place % 2 == 0) {
				row++;
			}
			place++;
		}
		
		char side;
		if(k % 2 == 0) {
			side = 'R';
		}else {
			side = 'L';
		}
		System.out.println(col +" "+ row +" "+ side);
	}
}
