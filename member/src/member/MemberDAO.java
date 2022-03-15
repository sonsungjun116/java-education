// DAO(Data Access Object)

package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	
	// 싱글톤 : 객체 생성을 한번만 수행하는 것.
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {	// 정적 메소드
		return instance;
	}

	// 컨넥션풀에서 컨넥션을 구해오는 메소드
	private Connection getConnection() throws Exception{
		Context init = new InitialContext();
  		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
  		return ds.getConnection();
	}
	
	// ID 중복 검사
	public int memberAuth(String id) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();		//컨넥션풀에서 컨넥션을 구해오는 메소드
			
			String sql = "select * from member where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();		// select SQL문을 실행

			if(rs.next()) {		// 조건식을 만족하는 데이터를 구해옴, next메소드는 boolean형으로 데이터를 가져오면 true 못가져오면 false
				result = 1;		// 중복 ID
			}else {
				result = -1;	// 사용 가능한 ID
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close();}catch(Exception e) {}
			if(pstmt != null) try { pstmt.close();}catch(Exception e) {}
			if(con != null) try { con.close();}catch(Exception e) {}
		}
		return result;
	}
	
	
	
	
	// 회원가입
	public int insert(MemberDTO member) {
		int result = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();	// 컨넥션풀에서 컨넥션을 구해옴.
		
String sql="insert into member ";
	   sql+=" values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate)";
			
	   		pstmt = con.prepareStatement(sql);
	   		pstmt.setString(1, member.getId());
	   		pstmt.setString(2, member.getPasswd());
	   		pstmt.setString(3, member.getName());
	   		pstmt.setString(4, member.getJumin1());
	   		pstmt.setString(5, member.getJumin2());
	   		pstmt.setString(6, member.getMailid());
	   		pstmt.setString(7, member.getDomain());
	   		pstmt.setString(8, member.getTel1());
	   		pstmt.setString(9, member.getTel2());
	   		pstmt.setString(10, member.getTel3());
	   		pstmt.setString(11, member.getPhone1());
	   		pstmt.setString(12, member.getPhone2());
	   		pstmt.setString(13, member.getPhone3());
	   		pstmt.setString(14, member.getPost());
	   		pstmt.setString(15, member.getAddress());
	   		pstmt.setString(16, member.getGender());
	   		pstmt.setString(17, member.getHobby());
	   		pstmt.setString(18, member.getIntro());
	   		
	   		result = pstmt.executeUpdate();		// SQL문 실행
	   
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) try { pstmt.close();}catch(Exception e) {}
			if(con != null) try { con.close();}catch(Exception e) {}
		}		
		
		return result;
	}
	
	
	// 로그인 (회원인증)
	public int memberCheck(MemberDTO member) {	//jsp에서 접근해야 하기 때문에 public
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;	//PreparedStatement는 SQL문을 실행해주는 역할
		ResultSet rs = null;
		
		try {
			con = getConnection();	// 컨넥션풀에서 컨넥션을 구해오는 역할
			
			String sql ="select * from member where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			rs = pstmt.executeQuery();		//SQL문 실행
			
			if(rs.next()) {					// rs.next()로 가져온다는 것은 ID가 일치한다는 뜻
				if(rs.getString("passwd").equals(member.getPasswd())) {						// 비번 일치
					result = 1;				// 비번 일치 (회원인증 성공)
				}else {						// 비번 불일치
					result = -1;			// 아이디는 맞지만 비번이 틀림
				}
				
			}else {							// ID 불일치
				result = -2;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close();}catch(Exception e) {}
			if(pstmt != null) try { pstmt.close();}catch(Exception e) {}
			if(con != null) try { con.close();}catch(Exception e) {}
		}
		
		
		return result;
	}
	
	
	// 회원 수정 폼 : 한 사람의 상세 정보 구하기
	public MemberDTO getMember(String id) {
		MemberDTO member = new MemberDTO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			
			String sql="select * from member where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();		// SQL문 실행
			
			if(rs.next()) {
//				member.id = "test";
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setJumin1(rs.getString("jumin1"));
				member.setJumin2(rs.getString("jumin2"));
				member.setMailid(rs.getString("mailid"));
				member.setDomain(rs.getString("domain"));
				member.setTel1(rs.getString("tel1"));
				member.setTel2(rs.getString("tel2"));
				member.setTel3(rs.getString("tel3"));
				member.setPhone1(rs.getString("phone1"));
				member.setPhone2(rs.getString("phone2"));
				member.setPhone3(rs.getString("phone3"));
				member.setPost(rs.getString("post"));
				member.setAddress(rs.getString("address"));
				member.setGender(rs.getString("gender"));
				member.setHobby(rs.getString("hobby"));
				member.setIntro(rs.getString("intro"));
				member.setRegister(rs.getTimestamp("register"));
				
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close();}catch(Exception e) {}
			if(pstmt != null) try { pstmt.close();}catch(Exception e) {}
			if(con != null) try { con.close();}catch(Exception e) {}
		}
		
		return member;
	}
	// 회원정보 수정
	public int update(MemberDTO member) {
		int result =0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
String sql = "update member set name=?,jumin1=?,jumin2=?,mailid=?,";
			sql+="domain=?,tel1=?,tel2=?,tel3=?,phone1=?,phone2=?,phone3=?,";
			sql+="post=?,address=?,gender=?,hobby=?,intro=? where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getJumin1());
			pstmt.setString(3, member.getJumin2());
			pstmt.setString(4, member.getMailid());
			pstmt.setString(5, member.getDomain());
			pstmt.setString(6, member.getTel1());
			pstmt.setString(7, member.getTel2());
			pstmt.setString(8, member.getTel3());
			pstmt.setString(9, member.getPhone1());
			pstmt.setString(10, member.getPhone2());
			pstmt.setString(11, member.getPhone3());
			pstmt.setString(12, member.getPost());
			pstmt.setString(13, member.getAddress());
			pstmt.setString(14, member.getGender());
			pstmt.setString(15, member.getHobby());
			pstmt.setString(16, member.getIntro());
			pstmt.setString(17, member.getId());
			
			result = pstmt.executeUpdate();		// SQL문 실행
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) try { pstmt.close();}catch(Exception e) {}
			if(con != null) try { con.close();}catch(Exception e) {}
		}
		
		return result;
	}

	// 회원정보 삭제
	public int delete(String id) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			String sql = "delete from member where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();		//SQL문 실행
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) try { pstmt.close();}catch(Exception e) {}
			if(con != null) try { con.close();}catch(Exception e) {}
		}
		
		return result;
	}

}