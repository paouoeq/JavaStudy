package exam08_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws Exception{

		// 날짜 데이터
		
		Date d = new Date();
		
		System.out.println(d); // 날짜 출력할 수 있는 방법 : d.toString()(참조변수 호출하면 자동 호출) 
		/*
		 *  d.toString() 했는데 클래스@16진수 값이 출력되면 Object
		 *  그게 아니면 해당 클래스에서 재정의 한 것
		 */
		
		// java.text.SimpleDateFormay 클래스와 병행해서 사용한다.
		// 가. Date 타입 --변환--> String 
		// Fri Jul 21 15:23:16 KST 2023 --변환--> 특정 포맷을 가진 문자열
		/*
		 * 		날짜 포맷
		 * 		년도 : yy / yyyy
		 * 		월 : MM
		 * 		일 : dd
		 * 		시간 : HH
		 * 		분 : mm
		 * 		초 : ss
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM.dd-HH:mm-ss");
		String result = sdf.format(d);
		System.out.println(result);
		
		// 나. String --변환--> Date
		// 문자열을 알아듣도록 포맷을 정확하게 일치시켜줘야 한다.
		String s = "2023년05월13일";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
		Date d2 = sdf2.parse(s); // 예외처리 필요함
		System.out.println(d2);
		
	}

}
