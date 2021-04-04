
public class makeArray {

	static int [] makedArray() {
		int temp[]  = new int[4];
		for(int i = 0; i < temp.length; i++)
			temp[i] = i;
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		intArray = makedArray();
		for(int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");
	}

}
