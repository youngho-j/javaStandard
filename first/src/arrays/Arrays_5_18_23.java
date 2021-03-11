package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_5_18_23 {
	public static void main(String[] args) throws IOException {
		/*
		 * 18. 2차원 배열 
		 * 테이블 형태의 데이터를 저장하기 위한 배열 (1차원 배열이 여러개 모인 것)
		 * 
		 * 참고 
		 * 3차원배열은? 
		 * 2차원 배열이 여러개 모인 것
		 * 
		 * 19. 2차원 배열 인덱스
		 * int[][] score = new int[4][3];
		 * -> 4행 3열의 2차원 배열 score 생성
		 *    							열 index ( 0 ~ 열의 길이 -1)
		 *    행 index ( 0 ~ 행의 길이 -1) |   |   |   |   |   |   |
		 *    
		 * 20. 2차원 배열 초기화
		 * int[][] arr = {{1,2,3}, {4,5,6}};
		 * 
		 * 보통 이렇게 많이 씀(직관적으로)
		 * int[][] arr = {
		 * 					{1,2,3}, 
		 * 					{4,5,6}
		 * 				};
		 *  
		 * 2차원 배열은 1차원 배열의 배열이다. 
		 * 
		 * 참조변수 arr이 가리키는 것은 arr[0], arr[1]
		 * 
		 * 참조변수 arr[0]가 가리키는 것은 arr[0][0], arr[0][1], arr[0][2]
		 */	
		
		//예제 1
		int [][] score = {
				{100, 100, 100}, 
				{20, 20, 20, 50},
				{30, 30, 30},
				{40, 40}
		};
		arraySum(score);
		System.out.println();
		int[][] point = {
				{100, 100, 100},
				{78, 85, 92},
				{50, 95, 62},
				{40, 70, 72},
				{89, 100, 32},
		};
		totalPrint(point);
		System.out.println();
		
		String[][] word = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"},
		};
		printQuiz(word);
	}
	
	public static void arraySum(int[][] arr) {
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, arr[i][j]);
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
	
	public static void totalPrint(int[][] arr) {
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호  국어  영어  수학   총점    평균");
		System.out.println("==============================");
		
		for(int i = 0 ; i < arr.length ; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			korTotal += arr[i][0];
			engTotal += arr[i][1];
			mathTotal += arr[i][2];
//			순번 출력, 자리수 지정이 되었기 때문에 오른쪽 정렬
//			서식 앞에 자리수 -> 총 출력 폭을 지정한다는 것
			System.out.printf("%3d", i+1);
			
//			각 과목 원점수 출력
			for(int j = 0 ; j < arr[i].length ; j++) {
				sum += arr[i][j];
				System.out.printf("%5d", arr[i][j]);
			}
//			평균
			avg = sum / (float)arr[i].length;
			System.out.printf("%5d", sum);
			
			System.out.printf("%7.1f", avg);
			System.out.println();
		}
		System.out.println("==============================");
		System.out.println("총점: " + korTotal + "  " + engTotal + "  " + mathTotal);
	}
	
	public static void printQuiz(String[][] word) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0 ; i < word.length ; i++) {
			// %s - 문자열 출력 지시자
			System.out.printf("Q%d. %s의 뜻은?", i+1, word[i][0]);
			
			String str = br.readLine();
			if(str.equals(word[i][1])) {
				System.out.println("정답입니다.\n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", word[i][1]);
			}
		}
	}
}
