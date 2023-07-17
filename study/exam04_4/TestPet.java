package exam04_4;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("야옹이", 2, "암컷");
		
		System.out.println(c.getName()+" "+c.getAge()+" "+c.getSex());
		
		// 수정
		c.setName("망치");
		c.setAge(3);
		System.out.println(c.getName()+" "+c.getAge()+" "+c.getSex());
		
		// 수정2 - 한꺼번에 수정
		c.setCat("나비", 5, "수컷");
		System.out.println(c.getName()+" "+c.getAge()+" "+c.getSex());
		
		// getCat 호출
		String result = c.getCat("깜이", 2, "암컷");
		System.out.println(result);
		
		c.xxx();
		
		System.out.println("end");
		
		c.yyy(10);
	}

}
