// DAO(Data Access Object)

package JavaBeanMember.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LogonDBBean {

	// 싱글톤 : 객체 생성을 한번만 수행 하는 것.
	private static LogonDBBean instance = new LogonDBBean();
	
	public static LogonDBBean getInstance() {
		return instance;
	}
	
	// 회원가입 : 주소값 전달에 의한 메소드 호출(Call by reference방식)
	public int insertMember(LogonDataBean member) {
		int result = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			// JDBC 방식
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql="insert into member2 values(?,?,?,?,?,?,?,sysdate)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getJumin1());
			pstmt.setString(5, member.getJumin2());
			pstmt.setString(6, member.getEmail());
			pstmt.setString(7, member.getBlog());
			
			result = pstmt.executeUpdate();		// SQL문 실행
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally { //예외 여부와 관계없이 무조건 실행
			if(pstmt != null) try {pstmt.close();}catch(Exception e) {}
			if(con != null) try {con.close();}catch(Exception e) {}
		}
		
		return result;
		
	}
	
	// 회원목록 출력
	public List<LogonDataBean> selectMember(){	//제너릭은 DTO, 제너릭을 쓰면 추후 앞에 데이터형을 생략할 수 있다.
		List<LogonDataBean> list = new ArrayList<LogonDataBean>(); // 왼쪽 부모 오른쪽 자식 업캐스팅
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql = "select * from member2";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();		//SQL문 실행
			
			while(rs.next()) { // next 함수는 boolean형이여서 데이터가 있으면 true로 계속 실행 없으면 false로 작동을 중지한다.
				LogonDataBean member = new LogonDataBean();		//dto 객체를 생성, usebean역할
//				member.id = "toto";			//접근제어자가 private이여서 접근 불가
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setJumin1(rs.getString("jumin1"));
				member.setJumin2(rs.getString("jumin2"));
				member.setEmail(rs.getString("email"));
				member.setBlog(rs.getString("blog"));
				member.setReg_date(rs.getDate("reg_date"));
				
				list.add(member);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch(Exception e) {}
			if(pstmt != null) try {pstmt.close();}catch(Exception e) {}
			if(con != null) try {con.close();}catch(Exception e) {}
		}
		
		return list;		
	}
	
	// 회원 수정 폼 : 회원 1명 정보 구하기
	public LogonDataBean updateForm(String id) {
		LogonDataBean member = new LogonDataBean();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql = "select * from member2 where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {				
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setJumin1(rs.getString("jumin1"));
				member.setJumin2(rs.getString("jumin2"));
				member.setEmail(rs.getString("email"));
				member.setBlog(rs.getString("blog"));
				member.setReg_date(rs.getDate("reg_date"));				
			}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		if(rs != null) try {rs.close();}catch(Exception e) {}
		if(pstmt != null) try {pstmt.close();}catch(Exception e) {}
		if(con != null) try {con.close();}catch(Exception e) {}
	}
	
	return member;
	
}
	// 회원 정보 수정
	public void update(LogonDataBean member) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql="update member2 set name=?,jumin=?,jumin2=?,";
					sql+="email=?,blog=?,reg_date=sysdate where id=?";
					
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getJumin1());
			pstmt.setString(3, member.getJumin2());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getBlog());
			pstmt.setString(6, member.getId());
			pstmt.executeUpdate();	//SQL문 실행
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) try {pstmt.close();}catch(Exception e) {}
			if(con != null) try {con.close();}catch(Exception e) {}
		}
		
		
	}
		public void delete(LogonDataBean member) {
			Connection con = null;
			PreparedStatement pstmt = null;
			
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url,"scott","tiger");
				
				String sql="delete from member2 where id=?";
						
						
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, member.getId());
				pstmt.executeUpdate();	//SQL문 실행
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				if(pstmt != null) try {pstmt.close();}catch(Exception e) {}
				if(con != null) try {con.close();}catch(Exception e) {}
			}
			
			
		}
		}
	

