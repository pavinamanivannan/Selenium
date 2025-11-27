package passingreference.Assingment;

class Game
{
	void install()
	{
		System.out.println("Free fire");
	}
}
class Playstore
{
	public static void main(String[]args)
	{
		Game g = new Game();
		Players.play(g);
	}
}
class Players
{
	static void play(Game f)
	{
		f.install();
	}
}