package locgicalprgm;

public class AddtwoArray {
	public static void main(String[] args) {
		int[] ar1= {01,02,03,04};
		int[] ar2= {05,06,07};
		int size = ar1.length+ar2.length;
		int[] ar3 = new int[size];
		for (int i = 0; i < ar1.length; i++) {
			ar3[i]=ar1[i];
		}
		for (int i = 0; i < ar2.length; i++) {
			ar3[i+ar1.length]=ar2[i];
		}
		for (int i : ar3) {
			System.out.println(i);
		}
	}
}
