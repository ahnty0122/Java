// Ÿ�� ��ȯ
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		int i = 100;
		
		System.out.println(b + i); // 227
		System.out.println(10 / 4); // 2
		System.out.println(10.0 / 4); // 2.5
		System.out.println((char)0x12340041); // A , char�� Ÿ�� ���� ��ȯ
		System.out.println((byte)(b + i)); // 227�� byte�� ũ�⸸ŭ ������ �ڸ���
		System.out.println((int)2.9 + 1.8); // 2 + 1.8
		System.out.println((int)(2.9 + 1.8)); // 4
		System.out.println((int)2.9 + (int)1.8); // 3
	}

}
