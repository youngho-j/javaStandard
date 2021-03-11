package arrays;

import java.util.Arrays;

public class Arrays_5_24 {
	public static void main(String[] args) {
		/*
		 * 24. Arrays로 배열 다루기
		 * Arrays : 배열관련 메서드를 모아 놓음
		 * 
		 * 배열 비교와 출력 - equals(), toString()
		 * 
		 * toString()
		 * 
		 * int[] arr = {0,1,2,3,4};
		 * int[][] arr2D = {{0,1}, {2,3}};
		 * 
		 * System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]
		 * System.out.println(Arrays.deepToString(arr2D)); // [[0, 1], [2, 3]]
		 * 
		 * String[][] str2D = new String[][]{{"aaa","bbb"}, {"AAA","BBB"}};
		 * String[][] str2D2 = new String[][]{{"aaa","bbb"}, {"AAA","BBB"}};
		 * 
		 * System.out.println(Arrays.equals(str2D, str2D2)); // false (1차원 배열 비교시만 사용해야함)
		 * System.out.println(Arrays.deepEquals(str2D, str2D2)); // true
		 * 
		 * 배열의 복사 - copyOf(), copyOfRange()
		 * 
		 * int[] arr = {0,1,2,3,4};
		 * 
		 * 참고 아래 코드의 arr.length -> 복사할 요소의 갯수
		 * int[] arr2 = Arrays.copyOf(arr, arr.length); // arr2 = [0, 1, 2, 3, 4]
		 * 
		 * int[] arr3 = Arrays.copyOf(arr, 3); // arr3 = [0, 1, 2]
		 * 
		 * 참조한 배열의 길이보다 길경우는 0이 들어가게 됨
		 * int[] arr4 = Arrays.copyOf(arr, 7); // arr4 = [0, 1, 2, 3, 4, 0, 0]
		 * 
		 * Arrays.copyOfRange(배열, from, to) -> 2번째 인덱스 부터 4번째 인덱스 전까지 복사 
		 * int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // arr5 = [2, 3]
		 * 
		 * Arrays.copyOfRange(배열, from, to) -> 0번째 인덱스 부터 7번째 인덱스 전까지 복사 범위를 벗어나면 0으로 복사됨 
		 * int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // arr5 = [2, 3]
		 * 
		 * 배열의 정렬 - sort()
		 * 
		 * int[] arr = {3, 2, 0, 1, 4};
		 * Arrays.sort(arr); //배열 정렬(오름차순)
		 * System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]
		 */
		 
		//출력
		 int[] arr = {3, 2, 0, 1, 4}; 
		 int[][] arr2D = {{11,12}, {21,22}};
		 
		 System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.deepToString(arr2D));
		 
		 //비교
		 String[][] str2D = new String[][]{{"aaa","bbb"}, {"AAA","BBB"}};
		 String[][] str2D2 = new String[][]{{"aaa","bbb"}, {"AAA","BBB"}};
		 
		 System.out.println(str2D == str2D2); //참조변수 값 비교
		 System.out.println(Arrays.deepEquals(str2D, str2D2)); // true
		 
		 //복사
		 int[] arr2 = Arrays.copyOf(arr, 7);
		 int[] arr3 = Arrays.copyOfRange(arr, 0, 4);
		 System.out.println(Arrays.toString(arr3));
		 
		 //정렬
		 System.out.println(Arrays.toString(arr2));
		 Arrays.sort(arr2);
		 System.out.println(Arrays.toString(arr2));
	}
}
