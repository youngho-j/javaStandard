package arrays;

public class Arrays_5_4_5 {
/*
 * 4. 배열의 길이 
 * 배열이름.length 를 통해 배열의 길이를 int형 상수로 보여줌
 * 
 * 길이가 5인 int배열 
 * int[] arr = new int[5]; 
 * 
 * int temp = arr.length;
 * 
 * 배열은 한번 생성하면 그 '길이를 바꿀 수 없다.'
 * 
 * 왜 길이를 못바꾸는가? 
 * 위의 int형 배열을 예시로 사용 배열을 선언후 생성하면
 * 20byte 크기의 공간 필요하므로
 * 메모리 공간에서 20byte 크기의 공간을 찾아야함
 * 
 * 왜 20byte공간이 필요한가? 
 * 배열은 연속적이기 때문에 int형은 4byte, 5개의 공간이 필요하므로
 * 
 * 이러한 상황에서 길이를 추가적으로 늘리고 싶어 배열 길이를 10으로 변경시 40byte가 필요한데,
 * 현재 상황에서 20byte의 추가적인 연속된 공간이 필요한 상황이 됨 
 * 하지만 지금 사용하고 있는 공간 이후가 비어있다는 보장이 없기 때문에 길이를 바꿀 수 없다.
 * 
 * 그럼 공간이 부족하면 어떻게 하는가? 
 * 새로운 큰 공간을 만들고 기존 내용을 복사해서 넣고 추가하고 싶은 것을 추가하면 됨
 */
	
/*
 * 5. 배열의 초기화 
 * 배열의 각 요소에 처음으로 값을 저장하는 것 
 * 
 * 배열은 기본적으로 자동 초기화가 됨 Ex) int[] -> 0 
 * 
 * Ex)
 * int[] score = new int[5]; //각 요소에 직접 값을 저장 score[0] = 50;
 * 
 * 저장하는 방법 
 * 1번
 * int[] score = new int[] {50, 60, 70, 80, 90};
 * 
 * 2번 - new int[]를 생략 가능, 거의 이러한 형식으로 사용! 
 * int[] score = {50, 60, 70, 80, 90};
 * 
 * 참고 
 * 2번을 '두 문장(선언과 초기화) 으로 나눠 쓰는 것은 허용 하지 않음' 
 * int[] score;
 * score = {50, 60, 70, 80, 90};
 * 
 * 거의 없는 경우지만 이렇게 써야함 
 * int[] score; 
 * score = new int[] {50, 60, 70, 80, 90};
 */
	
//	4_예제
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println("arr.length = " + arr.length);
		
//		arr.length를 사용하는 이유?
//		index 범위를 벗어나는 에러 방지를 위해(ArrayIndextOutOfBoundsException)
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr["+i+"]=" + arr[i]);
		}
				
	}
}
