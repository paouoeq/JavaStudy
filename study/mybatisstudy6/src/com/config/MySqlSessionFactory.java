package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {

	static SqlSessionFactory sqlSessionFactory = null; // staitc은 인스턴스변수에 접근할 수 없음(제일 먼저 생성되기 때문) -> satic 변수로 변경해줘야함
	
	static { // 생성자보다 먼저 실행됨
		String resource = "com/config/Configuration.xml";
		InputStream inputStream = null; // 초기화 해줘야 에러 안남
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	} //end static
	
	
	// ServiceImpl에 SqlSession 반환하는 메서드
	public static SqlSession getSession() { // 객체 생성하지 않고 사용하기 위해 static 메서드 사용
		SqlSession session = sqlSessionFactory.openSession();
		return session;
	}
}
