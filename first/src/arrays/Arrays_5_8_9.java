package arrays;

public class Arrays_5_8_9 {
//	8. 배열의 활용
	public static void main(String[] args) {
		//연습문제1
		StringBuilder sb = new StringBuilder();
		
		int[] score = {100, 88, 100, 100, 90};
		
		String[] ans = cals(score);
		
		sb.append("총점 : " + ans[0] + "\n").append("평균 : " + ans[1]).append("\n");
		
		System.out.println(sb);
		
		// 연습문제2
		StringBuilder sb1 = new StringBuilder();
		
		int[] score1 = {79, 88, 91, 33, 100, 55, 95};
		int[] ans1 = cals1(score1);
		
		sb1.append("최대값 : ").append(ans1[0]).append("\n")
		.append("최소값 : ").append(ans1[1]).append("\n");
		
		System.out.println(sb1);
		
		
		
	}
//	연습문제 1 - 합계와 평균 구하기
	public static String[] cals(int[] arr) {
		int sum = 0;
		float avg = 0f;
		
		//배열의 모든값을 더함
		for(int i = 0; i < arr.length ; i++) {
			sum += arr[i];
		}
		
		avg = sum / (float)arr.length; //계산 결과를 float 타입으로 얻기 위해 형변환
		
		String[] arr1 = new String[2];
		arr1[0] = String.valueOf(sum);
		arr1[1] = String.valueOf(avg);
		
		return arr1;
	}
//	연습문제 2 - 배열의 요소 중 제일 큰 값과 작은 값 찾기
	public static int[] cals1(int[] arr) {
		int[] ans = new int[2];
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ans[0] = max;
			} else if(arr[i] < min) {
				min = arr[i];
				ans[1] = min;
			}
		}
		return ans;
	}
}
