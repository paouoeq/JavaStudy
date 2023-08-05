import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DeptMain {

	public static void main(String[] args) throws Exception{
		// Configuration.xml 파일 읽기
		// Mapper은 Configuration 안에 정보가 적혀있어서 Configuration만 읽으면 됨
		String resource = "Configuration.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);

		// SqlSession 얻고 메서드 호출
		SqlSession session = sqlSessionFactory.openSession();
		
		System.out.println("단일행호출===================================");
		// 단일행 호출(id = findByDeptno) - 파라미터 있음
		DeptDTO dto = session.selectOne("DeptMapper.findByDeptno", 10); // mapper에서 #{deptno}이 10으로 치환
		System.out.println(dto);
		
		
		System.out.println("복수행호출 - 파라미터 없음=========================");
		// 복수행 호출(id = findAll) - 파라미터 없음		
		List<DeptDTO> list = session.selectList("DeptMapper.findAll");
		
		for(DeptDTO dto2 : list) {
			System.out.println(dto2);
		}
		
		
		System.out.println("복수행 호출 - 파라미터 없음 -> null, rowbound========");
		// 복수행 호출(id = findAll) - 파라미터 없음 -> null, rowbound
		RowBounds rb = new RowBounds(0,3);
		List<DeptDTO> listR = session.selectList("findAllPage", null, rb);
		
		for(DeptDTO dto1 : listR) {
			System.out.println(dto1);
		}
		
		
		System.out.println("복수행 호출 - 파라미터 있음, 여러개 입력받음 -> 파라미터 타입 DeptDTO=============");
		// 복수행 호출(id=findByDeptnoAndDname) - 파라미터 있음, 여러개 입력받음 -> 파라미터 타입 DeptDTO
		DeptDTO dto2 = new DeptDTO(); // 넘겨줄 인자값 만들기 위함
		dto2.setDeptno(10); // 해당하는 변수에 값을 넣어줌
		dto2.setDname("인사"); // 해당하는 변수에 값을 넣어줌
		List<DeptDTO> list2 = session.selectList("DeptMapper.findByDeptnoAndDname", dto2);
		
		for(DeptDTO dto3 : list2) {
			System.out.println(dto3);
		}
		
		
		System.out.println("복수행호출 - hashmap 이용==========================");
		// 복수행호출(id=findByDeptnoAndDnameMap) - hashmap 이용
		HashMap<String, Object> map = new HashMap<>(); // 파라미터에 들어갈 값이 하나는 string, 하나는 int => object
		map.put("xxx", 10);
		map.put("yyy", "인사");
		List<DeptDTO> list3 = session.selectList("DeptMapper.findByDeptnoAndDnameMap", map);
		
		for(DeptDTO dto4 : list3) {
			System.out.println(dto4);
		}
		System.out.println("=========================================");
				
		
		session.close();
		
		
		
		
	}

}
