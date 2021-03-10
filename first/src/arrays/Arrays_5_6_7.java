package arrays;

import java.util.Arrays;

public class Arrays_5_6_7 {
	
	public static void main(String[] args) {
	/*
	* 6. 배열의 출력 
	* int[] iArr = {100, 95, 80, 70, 60 };
	* 
	* 배열을 가리키는 참조변수 iArr의 값을 출력한다. 
	* System.out.println(iArr); // [I@14318bb] 와 같은 형식의 문자열이 출력 - Integer 배열의 주소
	* 
	* 참고 
	* char 배열일 경우에는 저장된 값이 출력됨
	* 
	* 배열의 모든 요소 출력 - 1. for문 사용 
	* for(int i = 0 ; i < iArr.length ; i++) {
	* 	System.out.println(iArr[i]); 
	* }
	* 
	* 배열의 모든 요소 출력 - 2. Arrays class 활용 
	* toString method - 배열의 내용을 문자열로 출력해줌
	* System.out.println(Arrays.toString(iArr));
	*/
		
		int[] iArr1 = {100, 90, 80 ,70, 50};
		System.out.println(Arrays.toString(iArr1));
	}
}
