package p2022_01_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Selectboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs01 = null;
		ResultSet rs02 = null;
		int count = 0;		// 총 데이터 갯수
		
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";
		
		SimpleDateFormat sd = 
						new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass" );  
			
			String sql="select count(*) from board";
			
			pstmt = con.prepareStatement(sql);
			rs01 = pstmt.executeQuery();
			if(rs01.next()) {
//				count = rs01.getInt(1);
				count = rs01.getInt("count(*)");
			}
			System.out.println("총데이터 수:" + count);
			
			System.out.println("번호\t작성자명\t비밀번호\t제목\t내용\t날짜");
			System.out.println("------------------------------------------------");
			
			sql = "select * from board order by no desc limit 0,4";
			
			pstmt = con.prepareStatement(sql);
			rs02 = pstmt.executeQuery();
			while(rs02.next()) {
				int no = rs02.getInt("no");
				String writer = rs02.getString("writer");
				String passwd = rs02.getString("passwd");
				String subject = rs02.getString("subject");
				String content = rs02.getString("content");
				Timestamp ts = rs02.getTimestamp("reg_date");
				
				System.out.print(no+"\t"+writer+"\t"+passwd+"\t");
				System.out.print(subject+"\t"+content+"\t"+sd.format(ts)+"\n");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs01 != null) rs01.close();
				if(rs02 != null) rs02.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
