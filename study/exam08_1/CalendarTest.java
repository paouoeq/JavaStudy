package exam08_1;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) throws Exception{

		// 날짜 데이터
		
		Calendar cal = Calendar.getInstance(); // 캘린더는 new로 생성 X
		System.out.println(cal);
		/* 출력값 
		 * java.util.GregorianCalendar
		 * [time=1689921885122,
		 * areFieldsSet=true,
		 * areAllFieldsSet=true,
		 * lenient=true,
		 * zone=sun.util.calendar.ZoneInfo
		 * [id="Asia/Seoul",
		 * offset=32400000,
		 * dstSavings=0,
		 * useDaylight=false,
		 * transitions=30,
		 * lastRule=null],
		 * firstDayOfWeek=1,
		 * minimalDaysInFirstWeek=1,
		 * ERA=1,YEAR=2023,
		 * MONTH=6,
		 * WEEK_OF_YEAR=29,
		 * WEEK_OF_MONTH=4,
		 * DAY_OF_MONTH=21,
		 * DAY_OF_YEAR=202,
		 * DAY_OF_WEEK=6,
		 * DAY_OF_WEEK_IN_MONTH=3,
		 * AM_PM=1,HOUR=3,
		 * HOUR_OF_DAY=15,
		 * MINUTE=44,
		 * SECOND=45,
		 * MILLISECOND=122,
		 * ZONE_OFFSET=32400000,
		 * DST_OFFSET=0]
		 */
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // js와 같이 1월이 0임
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("년: "+year);
		System.out.println("월: "+month);
		System.out.println("일: "+day);
		System.out.println("시: "+hour);
		System.out.println("분: "+minute);
		System.out.println("초: "+second);
		
		
		// 특정 날짜 설정
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2021, 0, 23);
		System.out.println("특정 날짜 설정");
		System.out.println("년: "+cal2.get(Calendar.YEAR));
		System.out.println("월: "+(cal2.get(Calendar.MONTH)+1));
		System.out.println("일: "+cal2.get(Calendar.DAY_OF_MONTH));
		System.out.println("시: "+cal2.get(Calendar.HOUR_OF_DAY));
		
	}

}
