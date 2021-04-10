import java.util.Scanner;

public class AntonAndPolyhedrons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int cnt = 0;
		while(n-- > 0) {
			String s = sc.nextLine();
			
			switch(s) {
			case "Tetrahedron":
				cnt += 4;
				break;
			case "Cube":
				cnt += 6;
				break;
			case "Octahedron":
				cnt += 8;
				break;
			case "Dodecahedron":
				cnt += 12;
				break;
			case "Icosahedron":
				cnt += 20;
				default:
			}
		}
		System.out.println(cnt);
	}
}
