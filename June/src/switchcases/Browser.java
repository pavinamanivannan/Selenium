package switchcases;

public class Browser {
	public static void main(String[] args) {
		String brows="chrome";
		switch(brows)
		{
		case("Edge"):System.out.println("Edge is launched");
		break;
		case("safari"):System.out.println("safari is launched");
		break;
		case("chrome"):System.out.println("chrome is launched");
		break;
		case("firefox"):System.out.println("firefox is launched");
		break;
		case("brave"):System.out.println("brave is launched");
		break;
		case("opera"):System.out.println("opera is launched");
		break;
		default:System.out.println("select to launch");
		}
	}
}
