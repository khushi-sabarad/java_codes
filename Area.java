//single inheritance using constructor and super keyword
class Room
{
	int length, breadth;
	Room(int x, int y)
	{
		length = x;
		breadth = y;
	}
	
	int area()
	{
		return(length*breadth);
	}
	
}

class Hall extends Room
{
	int height;
	Hall(int x,int y,int z)
		{
			super(x,y);
			height = z;
		}
		
	int Volume()
		{
			return(length*breadth*height);
		}
}

class Area
{
	public static void main(String args[])
	{
		Hall h1 = new Hall(10,10,10);
		{
			System.out.println("Area: "+h1.area());
			System.out.println("Volume:  "+h1.Volume());
		}
	}
}
