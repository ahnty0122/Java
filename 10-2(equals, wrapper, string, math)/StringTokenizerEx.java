import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// & 기준으로 문자열 분리
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int n = st.countTokens();
		System.out.println("토큰 개수 = " + n);
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
