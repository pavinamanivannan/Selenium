package passingreference.Assingment;

class Song
{
	void play()
	{
		System.out.println("Now playing : U1 songs");
	}
}
class Spotify
{
	public static void main(String[]args)
	{
		Song s = new Song();
		Listener.listen(s);
	}
}
class Listener
{
	static void listen(Song a)
	{
		a.play();
	}
}