package pattern;

public class Aletter {
	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if (j==1 && i!=1 || j==(n+1)/2 && i!=1 ||i==1 && j<(n+1)/2 && j!=1 || i==(n+1)/2 && j<=(n+1)/2)
//				if(i==1 && j<(n+1)/2 && j!=1)
//				if (
//	                    (j == 1 && i != 1) ||                         // left leg
//	                    (j == (n + 1) / 2 && i != 1) ||              // right leg
//	                    (i == 1 && j > 1 && j < (n + 1) / 2) ||      // top bar
//	                    (i == (n + 1) / 2 && j <= (n + 1) / 2)       // middle bar
//	                )
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
