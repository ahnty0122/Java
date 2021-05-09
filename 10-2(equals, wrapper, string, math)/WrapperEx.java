
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A')); // A�� �ҹ��ڷ� ��ȥ
		char c1 = '4', c2 = 'F';
		
		if(Character.isDigit(c1)) // ���� c1�� �����̸� true
			System.out.println(c1 + "�� ����");
		if(Character.isAlphabetic(c2)) // ���� c2�� �������̸� true
			System.out.println(c2 + "�� ������");
		
		System.out.println(Integer.parseInt("28")); // ���ڿ� "28"�� 10������ ��ȯ
		System.out.println(Integer.toString(28)); // ���� 28�� 2���� ���ڿ��� ��ȯ
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		
		Integer i = Integer.valueOf(28);
		System.out.println(i.doubleValue());
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));

		boolean b = (4>3); // true
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
		
	}

}
