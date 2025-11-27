package logical_online;

public class MakeOutWord {
	static String stringOut(String out, String word)
	{
//		return out.substring(0, 2)+word+out.substring(2);
		return out.substring(0, 2) + word + out.substring(2);

	}
	public static void main(String[] args) {
		String s=stringOut("<<>>", "Pavina");
		System.out.println(s);
	}
}
