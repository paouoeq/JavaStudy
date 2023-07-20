package school2;

public class StudentTest {

	public static void main(String[] args) {
		Student sArray[] = new Student[3];
		
		sArray[0] = new Student("홍길동", 15, 170, 80);
		sArray[1] = new Student("한사람", 13, 180, 70);
		sArray[2] = new Student("임걱정", 16, 175, 65);
		
		int[] sum = new int[] {0,0,0}; // 나이 신장 몸무게
		String[] name = new String[6];
		
		int aMax=0;
		int aMin=20;
		int hMax=0;
		int hMin=200;
		int wMax=0;
		int wMin=100;
		
		System.out.println("이름            나이           신장         몸무게");
		
		for (int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].studentInfo());
			sum[0]+=sArray[i].getAge();
			sum[1]+=sArray[i].getHeight();
			sum[2]+=sArray[i].getWeight();
			
			if(sArray[i].getAge() > aMax) {
				aMax = sArray[i].getAge();
				name[0] = sArray[i].getName();
			}
			if(sArray[i].getAge() < aMin) {
				aMin = sArray[i].getAge();
				name[1] = sArray[i].getName();
			}
			if(sArray[i].getHeight() > hMax) {
				hMax = sArray[i].getHeight();
				name[2] = sArray[i].getName();
			}
			if(sArray[i].getHeight() < hMin) {
				hMin = sArray[i].getHeight();
				name[3] = sArray[i].getName();
			}
			if(sArray[i].getWeight() > wMax) {
				wMax = sArray[i].getWeight();
				name[4] = sArray[i].getName();
			}
			if(sArray[i].getWeight() < wMin) {
				wMin = sArray[i].getWeight();
				name[5] = sArray[i].getName();
			}
			
		}
		
		System.out.printf("\n나이의 평균: %3.3f\n",sum[0]/3.0);
		System.out.printf("신장의 평균: %3.3f\n",sum[1]/3.0);
		System.out.printf("몸무게의 평균: %3.3f\n",sum[2]/3.0);
		
		System.out.println("\n나이가 가장 많은 학생: "+name[0]);
		System.out.println("나이가 가장 적은 학생: "+name[1]);
		System.out.println("신장이 가장 큰 학생: "+name[2]);
		System.out.println("신장이 가장 작은 학생: "+name[3]);
		System.out.println("몸무게가 가장 많이 나가는 학생: "+name[4]);
		System.out.println("몸무게가 가장 적게 나가는 학생: "+name[5]);
		
		
	}

}
