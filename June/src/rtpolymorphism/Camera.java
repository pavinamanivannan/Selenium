package rtpolymorphism;

class Camera_v1
{
	void feature()
	{
		System.out.println("Phone capture");
	}
}
class Camera_v2 extends Camera_v1
{
	void feature()
	{
		System.out.println("Video capture");
	}
}
class Camera_v3 extends Camera_v2
{
	void feature()
	{
		System.out.println("Night mode");
	}
}
class All_camera
{
	static void capture(Camera_v1 c)
	{
		c.feature();
	}
}
class Camera
{
	public static void main(String[]args)
	{
		Camera_v2 a = new Camera_v2();
		All_camera.capture(a);
	}
}