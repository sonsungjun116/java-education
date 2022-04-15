package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.CartDTO;

public class CartDAO {
	// 싱글톤
	private static CartDAO instance = new CartDAO();
	
	public static CartDAO getInstance() {
		return instance;
	}
	
	// 컨넥션 풀에서 컨넥션 구해오기
	private Connection getConnection() throws Exception {
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
		return ds.getConnection();
	}
	
	// 아래부분에 기능 추가
	
	public int cartAdd(CartDTO cart) {
		int result=0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			String sql="insert into cart ";
				   sql+=" values(cart_seq.nextval,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, cart.getMember_id());
			pstmt.setInt(2, cart.getCbook_num());
			pstmt.setString(3, cart.getCbook_name());
			pstmt.setInt(4, cart.getCbook_price());
				   
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		return result;
	}
	
	// 카트리스트 구해오기
	public List<CartDTO> cartGetList(String id){
		List<CartDTO> cartlist = new ArrayList<CartDTO>();
		Connection con  = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();

			String sql="select * from cart where member_id=?";			
	   
	   		pstmt = con.prepareStatement(sql);
	   		pstmt.setString(1, id);
	   		rs = pstmt.executeQuery();		// SQL문 실행
	   		
	   		while(rs.next()) {
	   			CartDTO cart = new CartDTO();
	   			
	   			cart.setCart_no(rs.getInt("cart_no"));
	   			cart.setMember_id(id);
	   			cart.setCbook_num(rs.getInt("cbook_num"));
	   			cart.setCbook_name(rs.getString("cbook_name"));
	   			cart.setCbook_price(rs.getInt("cbook_price"));
	   			
	   			cartlist.add(cart);
	   		}
	   		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close();}catch(Exception e) {}
			if(pstmt != null) try { pstmt.close();}catch(Exception e) {}
			if(con != null) try { con.close();}catch(Exception e) {}
		}
		
		return cartlist;
	}
	
	
	// 장바구니 리스트 1개 삭제
	public int cartDel(int cart_no) {
		int result = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			
			String sql = "delete from cart where cart_no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cart_no);
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		return result;
	}
	
}
