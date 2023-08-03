import java.util.HashMap;
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
			System.out.println("2. 전체 학생 목록");
			System.out.println("3. 학생 입학년도 범위 검색 (예> 2000부터 2003년까지)");
			System.out.println("4. 학생 학번으로 다중 검색 (쉼표 구분자)");
			System.out.println("5. 학생 휴학 일괄수정");
			System.out.println("6. 학과 정원 일괄수정");
			System.out.println("7. 학생 학점 검색");
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
			
			else if("2".equals(num)) {
				System.out.print("검색할 학생명을 입력하시오 => ");
				String name = sc.next();
				
				StudentService service = new StudentServiceImpl();
				List<StudentDTO> list = service.findName(name);
				
				System.out.println("===================================================================================");
				System.out.println("학번\t이름\t주민번호\t\t주소\t\t\t입학년도\t\t휴학여부");
				System.out.println("-----------------------------------------------------------------------------------");
				
				for(StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생수 : "+list.size()+" 명");
			}
			
			else if("3".equals(num)) {
				System.out.print("시작 입학년도 입력하시오 => ");
				String sYear = sc.next(); 
				System.out.print("끝 입학년도 입력하시오 => ");
				String eYear = sc.next();
				
				StudentService service = new StudentServiceImpl();
				HashMap<Integer, String> map = new HashMap<>();
				map.put(0, sYear);
				map.put(1, eYear);
				List<StudentDTO> list = service.findYear(map);
				
				for(StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생수 : "+list.size()+" 명");
			}
			
			else if("4".equals(num)) {
				System.out.print("검색할 학생의 학번을 입력하시오 => ");
				String sNum = sc.next();  //A674033,A656014,A612025
				
				StudentService service = new StudentServiceImpl();
				List<StudentDTO> list = service.findNo(sNum);
				
				System.out.println("===================================================================================");
				System.out.println("학번\t이름\t주민번호\t\t주소\t\t\t입학년도\t\t휴학여부");
				System.out.println("-----------------------------------------------------------------------------------");
				
				for(StudentDTO dto : list) {
					System.out.println(dto);
				}
				System.out.println("총 학생수 : "+list.size()+" 명");
			}
			
			else if("5".equals(num)) {
				System.out.print("수정할 학생의 학번을 입력하시오 => ");
				String sNum = sc.next(); //9556017,9732111,9747034
				
				StudentService service = new StudentServiceImpl();
				int n = service.updateAbs(sNum);
				
				System.out.println("총 변경된 학생수 : "+n+" 명");
			}
			
			else if("6".equals(num)) {
				
				StudentService service = new StudentServiceImpl();
				int n = service.updateCap(); //9556017
				
				System.out.println("총 변경된 학생수 : "+n+" 명");
			}
			
			else if("7".equals(num)) {
				System.out.print("학생의 학번을 입력하시오 => ");
				String sNum = sc.next(); 
				
				
				System.out.println("===================================================================================");
				System.out.println("학기\t학번\t이름\t과목명\t\t점수\t학점");
				System.out.println("-----------------------------------------------------------------------------------");
				
				StudentService service = new StudentServiceImpl();
				List<HashMap<String, String>> list = service.findPoint(sNum);
				
				for(HashMap<String, String> s : list) {
					System.out.println(s.get("학기")+"\t"+s.get("학번")+"\t"+s.get("이름")+"\t"+s.get("과목명")+"\t\t"+s.get("점수")+"\t"+s.get("학점")+" 학점");
				}
			}
			
			else if("0".equals(num)) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
		}
		
	}

}
