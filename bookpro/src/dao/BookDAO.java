package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.BookAdminDTO;
import model.BookDTO;

public class BookDAO {

	// 싱글톤 : 객체 생성을 한번만 수행하는 것.
	private static BookDAO instance = new BookDAO();

	public static BookDAO getInstance() { // 정적 메소드
		return instance;
	}

	// 컨넥션풀에서 컨넥션을 구해오는 메소드
	private Connection getConnection() throws Exception {
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
		return ds.getConnection();
	}

	// db관련 메소드 아래쪽에 추가

	// 도서등록

	public int BookInsert(BookDTO book) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = getConnection();

			String sql = "insert into book ";
			sql += "values(book_seq.nextval,?,?,?,?,0,?,?,?,'imgfile',sysdate)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, book.getBook_author());
			pstmt.setString(2, book.getBook_name());
			pstmt.setInt(3, book.getBook_price());
			pstmt.setInt(4, book.getBook_stock());
			pstmt.setString(5, book.getBook_pb());
			pstmt.setString(6, book.getBook_category());
			pstmt.setString(7, book.getBook_content());

			result = pstmt.executeUpdate(); // SQL문 실행

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) try { pstmt.close();}catch(Exception e) {}
			if(con != null) try { con.close();}catch(Exception e) {}
		}

		return result;
	}
	
	// 도서 총갯수 구하기
	public int bookGetCount() {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			String sql = "select count(*) from book";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt("count(*)");
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
	
	public List<BookDTO> bookGetList(int start, int end){
		List<BookDTO> list = new ArrayList<BookDTO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			String sql = "select * from ( select rownum rnum, board.* from ";
			sql +=" ( select * from book order by book_num desc ) board ) ";
			sql +=" where rnum >= ? and rnum <= ?";
			// select * from ( select rownum rnum, board.* from
			// (select * from book order by bbook_num desc ) board )
			// where rnum >= ? and rnum <= ? 
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BookDTO book = new BookDTO();
				book.setBook_num(rs.getInt("book_num"));
				book.setBook_author(rs.getString("book_author"));
				book.setBook_name(rs.getString("book_name"));
				book.setBook_price(rs.getInt("book_price"));
				book.setBook_count(rs.getInt("book_count"));
				book.setBook_pb(rs.getString("book_pb"));
				book.setBook_category(rs.getString("book_category"));
				book.setBook_content(rs.getString("book_content"));
				book.setBook_img(rs.getString("book_img"));
				book.setBook_reg(rs.getTimestamp("book_reg"));
				
				list.add(book);
			}
			
			
		}catch(Exception e) {
			
		}finally {
			if(rs != null) try { rs.close();}catch(Exception e) {}
			if(pstmt != null) try { pstmt.close();}catch(Exception e) {}
			if(con != null) try { con.close();}catch(Exception e) {}
		}
		
		return list;
		
	}
	
	// ajax로 관리자 아이디 여부 체크
    public int admincheck(String admin_id) {
       int result = 0;
       Connection con = null;
       PreparedStatement pstmt = null;
       ResultSet rs = null;
       
       try {
          con = getConnection();
          
          String sql = "select * from bookadmin where admin_id=?";
          pstmt = con.prepareStatement(sql);
          pstmt.setString(1, admin_id);
          
          rs = pstmt.executeQuery();
          
          if(rs.next()) {
             result=1;
          }
          
       }catch (Exception e) {
          e.printStackTrace();
       }finally {
          if(rs != null) try {rs.close();}catch (Exception e)   {}
          if(pstmt != null) try {pstmt.close();}catch (Exception e)   {}
          if(con != null) try {con.close();}catch (Exception e)   {}
       }
       
       return result;
    }
    
    // 관리자 아이디 정보 확인
    public BookAdminDTO getDetailAdmin(String admin_id) {
       BookAdminDTO admindto = new BookAdminDTO();
       Connection con = null;
       PreparedStatement pstmt = null;
       ResultSet rs = null;
       
       try {
          con = getConnection();
          
          String sql = "select * from bookadmin where admin_id=?";
          pstmt = con.prepareStatement(sql);
          pstmt.setString(1, admin_id);
          rs = pstmt.executeQuery();
          
          if(rs.next()) {
             admindto.setAdmin_id(rs.getString("admin_id"));
             admindto.setAdmin_pw(rs.getString("admin_pw"));
             admindto.setAdmin_mile(rs.getInt("admin_mile"));
          }
          
       }catch (Exception e) {
          e.printStackTrace();
       }finally {
          if(rs != null) try {rs.close();}catch (Exception e)   {}
          if(pstmt != null) try {pstmt.close();}catch (Exception e)   {}
          if(con != null) try {con.close();}catch (Exception e)   {}
       }
       
       
       return admindto;
    }

}
