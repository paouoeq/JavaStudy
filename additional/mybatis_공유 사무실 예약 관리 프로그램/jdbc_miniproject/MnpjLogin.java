package jdbc_miniproject;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.dto.CDTO;
import com.dto.MDTO;
import com.service.MService;
import com.service.MServiceImpl;

public class MnpjLogin {

	public static void main(String[] args) {
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("*********** 로그인/회원가입 ***********\n");
			System.out.println("[1. 로그인]");
			System.out.println("[2. 회원가입]");
			System.out.println("[0. 프로그램 종료]\n");
			System.out.print("메뉴를 입력해주세요 >> ");
			int n = sc.nextInt();
			System.out.println();
			
			// 로그인
			if(n==1) {
				System.out.println("[1. 고객]");
				System.out.println("[2. 매니저]\n");
				System.out.print("메뉴를 입력해주세요 >> ");
				int n1 = sc.nextInt();
				System.out.println();
				// 고객 로그인
				if(n1==1) {
					System.out.print("아이디를 입력해주세요 >> ");
					String client_id = sc.next();
					System.out.print("비밀번호를 입력해주세요 >> ");
					String client_pw = sc.next();
					System.out.println();
					
					MService service = new MServiceImpl();
					CDTO dto = service.clientLogin(client_id, client_pw);
					
					MnpjClientMain clientMain = new MnpjClientMain();
					clientMain.main(dto);
				}
				
				// 매니저 로그인
				else if(n1==2) {
					System.out.print("아이디를 입력해주세요 >> ");
					String manager_id = sc.next();
					System.out.print("비밀번호를 입력해주세요 >> ");
					String manager_pw = sc.next();
					System.out.println();
					
					MService service = new MServiceImpl();
					MDTO dto = service.managerLogin(manager_id, manager_pw);
					
					MnpjManagerMain managerMain = new MnpjManagerMain();
					managerMain.main(dto);
				}
			
			}
			
			// 회원가입
			else if (n==2) {
				System.out.println("[1. 고객]");
				System.out.println("[2. 매니저]\n");
				System.out.print("메뉴를 입력해주세요 >> ");
				int n2 = sc.nextInt();
				System.out.println();
				
				if(n2==1) {
					System.out.print("번호를 입력해주세요 >> ");
					int client_no = sc.nextInt();
					System.out.print("아이디를 입력해주세요 >> ");
					String client_id = sc.next();
					System.out.print("비밀번호를 입력해주세요 >> ");
					String client_pw = sc.next();
					System.out.print("이름을 입력해주세요 >> ");
					String client_nm = sc.next();
					System.out.print("핸드폰 번호를 입력해주세요 >> ");
					String phone = sc.next();
					System.out.print("탈퇴여부를 입력해주세요 >> ");
					String secession_fl = sc.next();
					System.out.println();
					
					MService svc = new MServiceImpl();
					int cn = svc.addC(new CDTO(client_no, client_id, client_pw, client_nm, phone, secession_fl));
					System.out.println("회원가입 되었습니다.");
				}
				else if(n2==2) {
					System.out.print("번호를 입력해주세요 >> ");
					int manager_no = sc.nextInt();
					System.out.print("아이디를 입력해주세요 >> ");
					String manager_id = sc.next();
					System.out.print("비밀번호를 입력해주세요 >> ");
					String manager_pw = sc.next();
					System.out.print("핸드폰 번호를 입력해주세요 >> ");
					String phone = sc.next();
					System.out.println();
					
					MService svc = new MServiceImpl();
					int mn = svc.addM(new MDTO(manager_no, manager_id, manager_pw, phone));
					System.out.println("회원가입 되었습니다.");
				}
				
				
			}
			
			// 종료
			else if (n==0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}
