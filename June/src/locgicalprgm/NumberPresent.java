package locgicalprgm;

public class NumberPresent {
	static void search(int[] ar,int key) {
		for (int i = 0; i < ar.length; i++) {
			if (key==ar[i]) {
				System.out.println(key+" is present at index"+i);
				return;
			}
		}
		System.out.println(key+" is not peresnt");
	}
	public static void main(String[] args) {
		int[] ar= {4,7,8,1,9};
		int key=13;
		search(ar,key);
	}
}
