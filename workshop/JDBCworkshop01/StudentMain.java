import java.util.List;
import java.util.Scanner;

import com.dto.StudentDTO;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class StudentMain {
	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("************************************");
			System.out.println("\t[학생 정보 관리 메뉴]");
			System.out.println("************************************");
			System.out.println("1. 전체 학생 목록");
			System.out.println("0. 종료");
			System.out.println("************************************");
			System.out.print("메뉴 입력 => ");
			String num = sc.nextLine();
			
			
			if("1".equals(num)) {
				StudentService service = new StudentServiceImpl();
				List<StudentDTO> list = service.findAll();
				
				System.out.println("===================================================================================");
				System.out.println("학번\t이름\t주민번호\t\t주소\t\t\t입학년도\t\t휴학여부");
				System.out.println("-----------------------------------------------------------------------------------");
				
				for(StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생수 : "+list.size()+" 명");
			}
			
			else if("0".equals(num)) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
			
			sc.close();
		}
		
	}

}
