package dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BookDAO {
	
	// 싱글톤 : 객체 생성을 한번만 수행하는 것.
		private static BookDAO instance = new BookDAO();
		
		public static BookDAO getInstance() {		// 정적 메소드
			return instance;
		}
		
		// 컨넥션풀에서 컨넥션을 구해오는 메소드
		private Connection getConnection() throws Exception{
			Context init = new InitialContext();
	  		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
	  		return ds.getConnection();
		}
		
	// db관련 메소드 아래쪽에 추가	
		

}
