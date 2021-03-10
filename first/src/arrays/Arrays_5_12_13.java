package arrays;

import java.util.Arrays;

public class Arrays_5_12_13 {
//	12. String배열의 선언과 생성
	public static void main(String[] args) {
//		참조형은 기본값이 null이다.
		
//		index : 0 ~ 3 -1 -> 0 ~ 2
		String[] Arr = {"바위", "가위", "보"};
		System.out.println(Arrays.toString(Arr));
//		랜덤 가위바위보 10회 출력
		for(int i = 0 ; i < 10 ; i++) {
			int temp = (int)(Math.random()*3);
			System.out.println(Arr[temp]);
		}
	}
}
