
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A')); // A를 소문자로 변혼
		char c1 = '4', c2 = 'F';
		
		if(Character.isDigit(c1)) // 문자 c1이 숫자이면 true
			System.out.println(c1 + "은 숫자");
		if(Character.isAlphabetic(c2)) // 문자 c2가 영문자이면 true
			System.out.println(c2 + "은 영문자");
		
		System.out.println(Integer.parseInt("28")); // 문자열 "28"을 10진수로 변환
		System.out.println(Integer.toString(28)); // 정수 28을 2진수 문자열로 변환
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
