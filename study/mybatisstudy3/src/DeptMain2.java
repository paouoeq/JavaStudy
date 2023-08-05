
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dto.DeptDTO;

public class DeptMain2 {

	public static void main(String[] args) throws Exception{
		// Configuration.xml 파일 읽기
		// Mapper은 Configuration 안에 정보가 적혀있어서 Configuration만 읽으면 됨
		String resource = "com/config/Configuration.xml"; // java와 달리 디렉터리 구분을 '/'로 함
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);

		// SqlSession 얻고 메서드 호출
		SqlSession session = sqlSessionFactory.openSession();
		
		// insert 작업 - 한번만 실행해야 오류 X
//		DeptDTO dto = new DeptDTO(99, "개발", "서울");
//		int n = session.insert("DeptMapper2.addDept", dto);
//		System.out.println(n+"개가 저장되었습니다.");
		
		// update 작업
//		HashMap<String,Object> map = new HashMap<String,Object>();
//		map.put("deptno", 99);
//		map.put("dname", "개발부");
//		map.put("loc", "서울시");
//		int n2 = session.update("DeptMapper2.updateDept", map);
//		System.out.println(n2+"개가 수정되었습니다.");
		
		//delete 작업
		int n3 = session.delete("DeptMapper2.deleteDept", 99);
		System.out.println(n3+"개가 삭제되었습니다.");
		
		session.commit(); // 트랜잭션 종료
		
		// (확인용 select)
		List<DeptDTO> list = session.selectList("DeptMapper.findAll");
		for(DeptDTO dto2 : list) {
			System.out.println(dto2);
		}
		
		session.close();
		
		
		
		
	}

}
