package school;

public class StudentTest {

	public static void main(String[] args) {
		
		Student StudentArray[] = new Student[3];
		
		StudentArray[0] = new Student("홍길동",15,171,81);
		StudentArray[1] = new Student("한사람",13,183,72);
		StudentArray[2] = new Student("임걱정",16,175,65);
		
		int aSum=0;
		int hSum=0;
		int wSum=0;
		
		
		System.out.println("이름            나이           신장         몸무게");
		for(int i=0; i<StudentArray.length; i++) {
			System.out.println(StudentArray[i].getName()+"         "+StudentArray[i].getAge()+"      "+StudentArray[i].getHeight()+"    "+StudentArray[i].getWeight());
			aSum+=StudentArray[i].getAge();
			hSum+=StudentArray[i].getHeight();
			wSum+=StudentArray[i].getWeight();
		}
		
		System.out.printf("나이의 평균: %3.2f\n",aSum/3.0);
		System.out.printf("신장의 평균: %3.2f\n",hSum/3.0);
		System.out.printf("몸무게의 평균: %3.2f\n",wSum/3.0);
		
	}

}
