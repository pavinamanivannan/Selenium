package locgicalprgm;

public class CountOfPrimeNo {
	static boolean isPrime(int n)
	{
		int count=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0)
				count++;
		}
		return(count==2);
	}
	public static void main(String[] args) {
		int[] ar= {11,4,6,2,7,9,29};
		int count=0;
		for (int i = 0; i < ar.length; i++) {
			if (isPrime(ar[i])) {
				count++;
			} 
		}
		System.out.println(count);
	}
}
