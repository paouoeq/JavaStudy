package jdbc_miniproject;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.dto.CDTO;
import com.dto.RDTO;
import com.service.MService;
import com.service.MServiceImpl;

public class MnpjClientMain {

	public static void main(CDTO dto) {
		
		while(true) {
			System.out.println("\nID : "+dto.getClient_id());
			Scanner sc = new Scanner(System.in);
			System.out.println("*********** 회원제 게시판 프로그램 ***********\n");
			System.out.println("[1. 예약 가능 지점]");
			System.out.println("[2. 예약 신청]");
			System.out.println("[3. 예약 조회]");
			System.out.println("[9. 로그아웃]");
			System.out.println("[0. 프로그램 종료]\n");
			System.out.print("메뉴를 입력해주세요 >> ");
			int n = sc.nextInt();
			System.out.println();
			
			if(n==1) {
				System.out.println("201. H1");
				System.out.println("202. H2");
				System.out.println("203. H3");
				System.out.println("204. H4");
				System.out.println("205. H5\n");
				System.out.print("지점을 입력하세요 : ");
				int place_no = sc.nextInt();
				System.out.println();
				
				System.out.println("[예약 불가 일정]");
				MService service = new MServiceImpl();
				List<RDTO> list = service.placeResList(place_no);
				for(RDTO rdto : list) {
					System.out.println("["+rdto.getRes_date()+"]");
				}
				
			}
			else if(n==2) {
				System.out.println("[예약신청]\n");
				System.out.println("201. H1");
				System.out.println("202. H2");
				System.out.println("203. H3");
				System.out.println("204. H4");
				System.out.println("205. H5\n");
				System.out.print("예약할 지점을 입력하세요 : ");
				int place_no = sc.nextInt();
				System.out.print("예약할 날짜를 입력하세요 : ");
				String res_date = sc.next();

				MService service = new MServiceImpl();
				
				// 검증
				List<RDTO> selectListPNo = service.selectResDateWherePNo(place_no);
				for(RDTO rdto : selectListPNo) {
					if(rdto.getRes_date().equals(res_date)) {
						System.out.println("\n[예약이 불가합니다.]\n");
						main(dto);
					}else {
						continue;
					}
				}
				
				System.out.print("예약 번호를 입력하세요 : ");
				int res_no = sc.nextInt();
				RDTO rdto = new RDTO(place_no, dto.getClient_no(), 'N', res_date, res_no);
				
				int rn = service.addRes(rdto);
				System.out.println("\n[예약이 완료되었습니다.]");
				
			}
			else if(n==3) {
				System.out.println("[예약조회]\n");
				
				MService service = new MServiceImpl();
				List<RDTO> list = service.findRes(dto.getClient_no());
				for(RDTO rdto : list) {
					System.out.println(rdto.getRes_no()+". ["+rdto.getRes_date()+"]");
				}
				System.out.println();
				System.out.println("1. 예약 취소");
				System.out.println("2. 예약 변경");
				System.out.print("메뉴를 입력해주세요 >> ");
				int n3 = sc.nextInt();
				
				if(n3==1) {
					System.out.println("\n[예약 취소]\n");
					System.out.print("취소하실 예약 번호 입력 >> ");
					int deleteRes_no = sc.nextInt();
					int n3_1 = service.deleteRes(deleteRes_no);
					System.out.println("\n[예약 취소 완료]\n");
				}
				else if(n3==2) {
					System.out.println("\n[예약 변경]\n");
					System.out.print("변경하고 싶은 예약 번호 입력 >> ");
					int updateRes_no = sc.nextInt();
					System.out.print("변경하고 싶은 일자 입력 >> ");
					String updateRes_date = sc.next();
					
					
					// 검증
					List<RDTO> selectList = service.selectPlaceNoResDate(updateRes_no);
					for(RDTO rdto : selectList) {
						if(rdto.getRes_date().equals(updateRes_date)) {
							System.out.println("\n[예약이 불가합니다.]\n");
							main(dto);
						}else {
							continue;
						}
					}
					
					HashMap<String, Object> map = new HashMap<String, Object>();
					map.put("res_no", updateRes_no);
					map.put("res_date", updateRes_date);
					
					int n3_2 = service.updateResDate(map);
					System.out.println("\n[변경 완료]\n");
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
