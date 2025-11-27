package locgicalprgm;


public class SumOfPrimeNo {
	static boolean isPrime(int n)
	{
		int count=0;
		for (int i = 1; i <=n; i++) {
			if (n%i==0) {
				count++;
			}
		}
		return(count==2);
	}
	public static void main(String[] args) {
		int[] ar= {2,7,8,9,11,17,3};
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			if (isPrime(ar[i])) {
				sum=sum+ar[i];
			}
		}
		System.out.println(sum);
	}
}
