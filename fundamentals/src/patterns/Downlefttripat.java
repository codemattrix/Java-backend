package patterns;

public class Downlefttripat {
	public static void triangle(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=i;j<=num;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}	
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Downlefttripat.triangle(5);
	}

}
