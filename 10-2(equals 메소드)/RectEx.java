class Rect{
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {
		Rect p = (Rect)obj;
		if(width * height == p.width * p.height)
			return true;
		else
			return false;
	}
}

public class RectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect a = new Rect(2, 3); // 6
		Rect b = new Rect(3, 2); // 6
		Rect c = new Rect(3, 4); // 12
		
		if(a.equals(b))
			System.out.println("a is equals b");
		if(a.equals(c))
			System.out.println("a is equals c");
		if(b.equals(c))
			System.out.println("b is equals c");
	}

}
