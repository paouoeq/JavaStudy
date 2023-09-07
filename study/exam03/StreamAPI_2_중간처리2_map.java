package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Student {
	String username;
	int score;
	public Student() {
	}
	public Student(String username, int score) {
		this.username = username;
		this.score = score;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", score=" + score + "]";
	}
	
	
}
public class StreamAPI_2_중간처리2_map {

	public static void main(String[] args) {
		
		/*
		 	map(Function), mapToInt(ToIntFunction), mapToDouble(ToDoubleFunction), mapToLong(ToLongFunction)
		 	- 역할 : 요소를 가공하여 새로운 스트림을 반환한다.
		 */
		
		List<Student> list = Arrays.asList(new Student("홍길동", 90), new Student("이순신", 80), new Student("유관순", 50));
		
		// 가공 1 : 이름에서 성만 출력
		
		// 익명 함수
		Function<Student, String> mapper = new Function<Student, String>() {
			
			@Override
			public String apply(Student t) {
				// TODO Auto-generated method stub
				return t.getUsername().substring(0,1);
			}
		};
		list.stream().map(mapper).forEach(System.out::println);
		System.out.println();
		
		// 람다 표현식
		list.stream().map(t->t.getUsername().substring(0, 1)).forEach(System.out::println);
		System.out.println();
		
		
		// 가공 2 : score 값만 출력
		
		// 람다 표현식
		list.stream().map(t->t.getScore()).forEach(System.out::println);
		System.out.println();
		
		// method reference
		list.stream().mapToInt(Student::getScore).forEach(System.out::println); // score 값이 int이기 때문에 mapToInt 사용 가능
		System.out.println();
	}

}
