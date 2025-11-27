package locgicalprgm;


public class RageOfPrimeNo {
	static void input(int n)
	{
		for (int i =2; i <=n; i++) {
			int num = i;
			int count=0;
			for (int j = 1; j <=num; j++) {
				if (num%j==0) {
					count++;
				}
			}
			if(count==2)
				System.out.println(num);
		}
	}
	public static void main(String[] args) {
		input(100);
	}
}
