package rtpolymorphism;

class Game_v1
{
	void play()
	{
		System.out.println("Play eith keyboard");
	}
}
class Game_v2 extends Game_v1
{
	void play()
	{
		System.out.println("Play with mouse");
	}
}
class Game_v3 extends Game_v2
{
	void play()
	{
		System.out.println("Play with VR");
	}
}
class Game_all
{
	static void download(Game_v1 g)
	{
		g.play();
	}
}
class Game
{
	public static void main(String[]args)
	{
		Game_v3 s = new Game_v3();
		Game_all.download(s);
	}
}