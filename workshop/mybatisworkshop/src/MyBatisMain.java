import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.dto.StudentDTO;
import com.service.MyBatisService;
import com.service.MyBatisServiceImpl;

public class MyBatisMain {

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("************************************");
			System.out.println("\t[학생 정보 관리 메뉴]");
			System.out.println("************************************");
			System.out.println("1. 전체 학생 목록");
			System.out.println("2. 학생 이름 검색");
			System.out.println("3. 학생 입학년도 범위 검색 (예> 2000년부터 2003년까지)");
			System.out.println("4. 학생 학번으로 다중 검색 (쉼표 구분자)");
			System.out.println("0. 종료");
			System.out.println("************************************");
			System.out.print("메뉴 입력 => ");
			int n = sc.nextInt();
			MyBatisService service = new MyBatisServiceImpl();
			if(n==1) {
				List<StudentDTO> list = service.findAll();
				
				System.out.println("===================================================================================");
				System.out.println("학번\t이름\t주민번호\t\t주소\t\t\t입학년도\t\t휴학여부");
				System.out.println("-----------------------------------------------------------------------------------");
				
				for(StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생수: "+list.size()+" 명");
				
			}
			
			else if(n==2) {				
				System.out.print("검색할 학생명을 입력하시오 => ");
				String name = sc.next();
				List<StudentDTO> list = service.findName(name);
				
				System.out.println("===================================================================================");
				System.out.println("학번\t이름\t주민번호\t\t주소\t\t\t입학년도\t\t휴학여부");
				System.out.println("-----------------------------------------------------------------------------------");
				
				for(StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생수: "+list.size()+" 명");
				
			}
			else if(n==3) {
				System.out.print("시작 입학년도 입력하시오 => ");
				int sYear = sc.nextInt();
				System.out.print("끝 입학년도 입력하시오 => ");
				int eYear = sc.nextInt();
				HashMap<String, Integer> map = new HashMap<>();
				map.put("sYear", sYear);
				map.put("eYear", eYear);
				
				List<StudentDTO> list = service.findYear(map);
				
				System.out.println("===================================================================================");
				System.out.println("학번\t이름\t주민번호\t\t주소\t\t\t입학년도\t\t휴학여부");
				System.out.println("-----------------------------------------------------------------------------------");
				
				for(StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생수: "+list.size()+" 명");
			}
			else if(n==4) {
				System.out.print("검색할 학생의 학번을 입력하시오 => ");
				String sNum = sc.next(); // A674033,A656014
				
				List<StudentDTO> list = service.findNumAll(sNum);
				
				System.out.println("===================================================================================");
				System.out.println("학번\t이름\t주민번호\t\t주소\t\t\t입학년도\t\t휴학여부");
				System.out.println("-----------------------------------------------------------------------------------");
				
				for(StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생수: "+list.size()+" 명");
			}
			else if(n==0) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
			
			
		}
	}
}
