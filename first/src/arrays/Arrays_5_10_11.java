package arrays;

import java.util.Arrays;

public class Arrays_5_10_11 {
//	10. 배열의 활용
	public static void main(String[] args) {
//		연습문제 1 - 배열 섞기
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		suffle(numArr);
//		연습문제 2 - 로또
		lotto();
	}
//	연습문제 1
	public static void suffle(int[] arr) {
		System.out.println(Arrays.toString(arr));
		for(int i = 0 ; i < 100 ; i++) {
			int n = (int)(Math.random() * 10);
//			우유와 콜라가 든 컵의 내용물 바꾸기 
//			temp 변수를 생성해서 기존에 있던 값을 옮김
			int temp = arr[0];
//			기존의 빈곳에 랜덤으로 생성된 자리수를 넣음
			arr[0] = arr[n];
//			랜덤으로 생성된 빈 자리에 temp에 있던 값을 더해줌
			arr[n] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
//	연습문제 2
	public static void lotto() {
		int ball[] = new int[45];
		int temp = 0;
		int randomNum = 0;
		
		for(int i = 0 ; i < ball.length ; i++) {
			ball[i] = i + 1;
		}
		
		for(int i = 0 ; i < 6 ; i++) {
			randomNum = (int)(Math.random() * 45);
			temp = ball[i];
			ball[i] = ball[randomNum];
			ball[randomNum] = temp;
		}
		for(int i = 0 ; i < 6 ; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}
}
