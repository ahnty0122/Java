public class printrand {

	public static void main(String[] args) {
		
		int a, b, c;
		while(true)
		{
			a = (int)(Math.random() * 3 + 1);
			b = (int)(Math.random() * 3 + 1);
			c = (int)(Math.random() * 3 + 1);
			System.out.println(a + " " + b + " " + c);
			if(a == b)
			{	
				if(b == c)
				{	
					if(a == c)
						System.out.println("¼º°ø");
						break;
				}
			}
		}
	}
}
