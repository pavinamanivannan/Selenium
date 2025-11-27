package locgicalprgm;

public class Strongnumber {
		public static void main(String[] args) {
			int no = 145;
			int copy = no;
			int sum = 0;
			while(no!=0)
			{
				int rem=no%10;
				int fact = 1;
				for (int i = 0; i <=rem; i++)
				fact= fact*i;
				{
					sum = sum+fact;
					no=no/10;
				}
			}
			if (copy==sum) {
				System.out.println(copy+" It's a strong number");
			}
			else
			{
				System.out.println(copy+" It's not a strong number");
			}
		}
}
