package arrays;

public class Arrays_5_14_15 {
	public static void main(String[] args) {
	/*
	 * 14. String 클래스
	 * 
	 * 특징
	 * 
	 * 문자열 -> 여러개의 문자를 나열 
	 * 즉, String 클래스는 `char[]에 메서드(기능)을 결합`한 것
	 * 
	 * `내용을 변경 할 수 없다.`(read only)
	 * 읽기만 가능하므로 문자열 결합 시 기존의 변수 값이 바뀌는 것이 아니라 
	 * 완전히 새로운 문자열이 만들어지고 참조변수에 새로운 주소값이 매칭되는 것 
	 * 
	 * 주요 메서드
	 * char charAt(int index) 
	 * 문자열에서 해당 위치(index)에 있는 문자를 반환
	 * Ex)
	 * String str = "ABCDE";
	 * char ch = str.charAt(3); D를 ch에 저장
	 * 
	 * int length()
	 * 문자열의 길이를 반환
	 * 
	 * String substring(int from, int to)
	 * 문자열에서 해당 범위(from ~ to)의 문자열 반환 (to는 포함되지 않는다!!!)
	 * Ex)
	 * String str = "ABCDE";
	 * String temp = str.substring(1, 4);
	 * System.out.println(temp) BCD 출력
	 * 
	 * boolan equals(Object obj)
	 * 문자열의 내용이 같은지 확인
	 * 같으면 true, 다르면 false
	 * 
	 * char[] toCharArray()
	 * 문자열을 문자배열(char[])로 변환해서 반환
	 */	
		
		String str = "ABCDE";
//		문자열 중 문자하나를 꺼내옴
		char ch = str.charAt(2);
		System.out.println(ch);
		
//		문자열에서 해당 범위의 문자열 출력
		String str2 = str.substring(1, 4);
		System.out.println(str2);
	}
}
