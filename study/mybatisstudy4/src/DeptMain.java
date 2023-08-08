
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dto.DeptDTO;

public class DeptMain {

	public static void main(String[] args) throws Exception{
		// Configuration.xml 파일 읽기
		// Mapper은 Configuration 안에 정보가 적혀있어서 Configuration만 읽으면 됨
		String resource = "com/config/Configuration.xml"; // java와 달리 디렉터리 구분을 '/'로 함
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// SqlSession 얻고 메서드 호출
		SqlSession session = sqlSessionFactory.openSession();
		
		// Dynamic SQL
		// 1. multi select
		// select * from dept where deptno IN ( 값, 값2, ...) -> 찾아야하는 deptno값의 갯수가 정해져있지 않음
		List<Integer> deptnoList = Arrays.asList(10, 20, 30);
		
		List<DeptDTO> list = session.selectList("DeptDynamicMapper.selectByDeptnoMulti", deptnoList);
		
		for(DeptDTO dto : list) {
			System.out.println(dto);
		}
		System.out.println();
		
		
		// 1. multi select2
		// select * from dept where deptno IN (값, 값2, ...)
		List<DeptDTO> deptnoList2 = Arrays.asList(new DeptDTO(10,"",""),new DeptDTO(20,"",""),new DeptDTO(40,"",""));
		
		List<DeptDTO> list2 = session.selectList("DeptDynamicMapper.selectByDeptnoMulti2", deptnoList2);
		
		for(DeptDTO dto : list2) {
			System.out.println(dto);
		}
		System.out.println();
		
		// 2. multi delete
		// delete from dept where deptno IN (값, 값2, ...)
		List<Integer> deptnoList3 = Arrays.asList(50, 51, 60);
		int n = session.delete("DeptDynamicMapper.deleteMulti", deptnoList3);
		System.out.println(n+"개가 삭제됨");
		session.commit();
		
		// 3. multi update
		// update dept set dname='개발' where deptno IN ( 값, 값2, ...)
		List<Integer> deptnoList4 = Arrays.asList(12, 80); // 인사 -> 개발
		int n2 = session.update("DeptDynamicMapper.updateMulti", deptnoList4);
		System.out.println(n2+"개가 수정됨");
		session.commit();
		
		// 4. multi insert
		/*
		 * 	insert all
		 * 		into dept ~
		 * 		into dept ~
		 * 	subquery;
		 */
		
//		List<DeptDTO> deptnoList5 = Arrays.asList(new DeptDTO(90,"개발","서울"),
//												  new DeptDTO(91,"개발","서울"),
//												  new DeptDTO(92,"개발","서울"));
//		int n3 = session.insert("DeptDynamicMapper.insertMulti", deptnoList5);
//		System.out.println(n3+"개가 생성됨");
//		session.commit();
		
		// 조건 (단일 if만 지원 => if~else 지원 X / 조건이 여러개인 경우 choose문 사용(switch문과 비슷))
		// 5. 단일if문
		// dname 파라미터 값이 있으면(!=null) 전자, 값이 없으면(null) 후자로 실행되도록 만듦
		// select * from dept where dname = 값; 또는  select * from dept
		System.out.println();
		
//		String dname="개발";
		String dname=null;
		List<DeptDTO> list3 = session.selectList("DeptDynamicMapper.selectAllorDname", dname);
		
		for(DeptDTO dto : list3) {
			System.out.println(dto);
		}
		System.out.println();
		
		
		// 6. 다중 조건
		/*
		 *  dname = 값 에 따라서 select 결과가 달라짐
		 *  
		 *  dname 값이 '개발' ==> 10, 20, 30 검색
		 *  dname 값이 '영업부' ==> 40 검색
		 *  dname 값이 모두 만족하지 않으면 ==> 90,91,92 검색
		 */
		
		HashMap<String, String> map = new HashMap<>();
		map.put("dname", "개발"); // 개발, 영업부, 그 이외 값
		
		List<DeptDTO> list4 = session.selectList("DeptDynamicMapper.selectByDnameChoose", map);
		
		for(DeptDTO dto : list4) {
			System.out.println(dto);
		}
		System.out.println();
		
		
		session.close();
		
	}

}
