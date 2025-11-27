package locgicalprgm;

public class PrimeNoArray {
	static void isPrime(int n)
	{
		int count=0;
		for (int i = 1; i <=n; i++) {
			if (n%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		int[] ar= {10,9,3,6,11,5};
		for (int i = 0; i < ar.length; i++) {
			isPrime(ar[i]);
		}
	}
}
