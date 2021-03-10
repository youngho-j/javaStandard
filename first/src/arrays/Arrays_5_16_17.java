package arrays;

public class Arrays_5_16_17 {
	public static void main(String[] args) {
//		16. 커맨드 라인을 통해 입력 받기
		
		/*
		 * 커맨드 라인에 입력한 값이 문자열 배열에 담겨서 전달됨
		 * 자바에서는 배열의 길이가 0일 수 있음 
		 * Ex) ""(빈문자열)
		 * 
		 * 커맨드 라인 사용법
		 * 메뉴 -> Run 탭 -> Run Congigurations -> 해당 java 파일 지정 -> argument 탭에 입력 후 실행
		 * 
		 * cmd(윈도우에서 실행)
		 * 1. cmd 실행
		 * 2. class 파일 있는 위치로 이동 (자바 파일 우클릭후 properties에서 위치 확인, bin 폴더 까지만)
		 *    2-1. C 드라이브인 경우 cd로 이동
		 *    2-1-1. 다른 드라이브 위치에 있는 경우 해당 드라이브로 이동 ex) H:
		 *    2-1-2. cd (파일 경로) 로 이동     
		 * 3. java (파일명) 변수를 띄어쓰기로 구분하여 실행
		 *    주의! bin 폴더 다음 폴더가 존재시 java (bin 다음 폴더명)/(자바파일명) 으로 실행
		 */
		
		System.out.println("매개변수의 개수 : " + args.length);
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
	}
}
