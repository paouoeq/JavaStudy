package jdbc_miniproject;

import java.util.List;
import java.util.Scanner;

import com.dto.MDTO;
import com.dto.PDTO;
import com.dto.RDTO;
import com.service.MService;
import com.service.MServiceImpl;

public class MnpjManagerMain {

	public static void main(MDTO dto) {
		
		while(true) {
			System.out.println("\nID : "+dto.getManager_id());
			Scanner sc = new Scanner(System.in);
			System.out.println("*********** 매니저 게시판 프로그램 ***********\n");
			System.out.println("[1. 관리중인 지점]");
			System.out.println("[2. 예약 관리]");
			System.out.println("[9. 로그아웃]");
			System.out.println("[0. 프로그램 종료]");
			System.out.print("메뉴를 입력해주세요 >> ");
			int n = sc.nextInt();
			
			if(n==1) {
				System.out.println("[관리중인 지점 목록]");
				
				MService service = new MServiceImpl();
				List<PDTO> list = service.manageAllPlace(dto.getManager_no());
				for(PDTO pdto : list) {
					System.out.println("["+pdto.getPlace_no()+". "+pdto.getPlace_nm()+" - "+pdto.getPlace_ard()+"]");
				}
			}
			else if(n==2) {
				System.out.println("1. 예약 고객 조회");
				System.out.println("2. 예약 고객 초기화");
				int n2 = sc.nextInt();
				if(n2==1) {
					System.out.println("일정 [고객명]");
					
					MService service = new MServiceImpl();
					List<RDTO> list = service.reservationClientFind(dto.getManager_no());
					for(RDTO rdto : list) {
						System.out.println(rdto.getClient_no()+". "+rdto.getRes_date()+" ["+rdto.getClient_nm()+"] : "+rdto.getPlace_nm());
					}
				}
				else if(n2==2) {
					MService service = new MServiceImpl();
					List<PDTO> list = service.managePlace(dto.getManager_no());
					for(PDTO pdto : list) {
						System.out.println("["+pdto.getPlace_no()+". "+pdto.getPlace_nm()+" - "+pdto.getPlace_ard()+"]");
					}
					System.out.print("지점을 선택하세요 : ");
					int n2_2 = sc.nextInt();
					int un = service.updateResEndUse(n2_2);
					System.out.println(n2_2+"번 지점이 초기화 되었습니다.");
				}
			}
			else if(n==9) {
				String[] st = new String[0];
				MnpjLogin.main(st);
			}
			else if(n==0) {
				System.exit(0);
			}
		}

	}

}
