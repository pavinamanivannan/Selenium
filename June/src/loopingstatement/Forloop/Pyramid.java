package loopingstatement.Forloop;

class Pyramid 
{
	public class LeftAlignedTriangle {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}

}

