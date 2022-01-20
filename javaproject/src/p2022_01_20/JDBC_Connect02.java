package p2022_01_20;

import java.sql.*;

public class JDBC_Connect02 {

	public static void main(String[] args) {

		/** ORACLE JDBC Driver Test *****************************************/
//		String driver = "oracle.jdbc.driver.OracleDriver"; // --> driver까지가 패키지, OracleDriver는 바이트
//		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 같은 ip를 가질때 localhost, 1521은 포트, xe는 전역데이터 명
		/*******************************************************************/

		/** My-SQL JDBC Driver *********************************************/
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";
		/*******************************************************************/

		Connection con = null;

		try {

			Class.forName(driver);	//JDBC Driver Loading --> 가장 먼저 해야하는 작업

			/** ORACLE에서 Connection 객체 ***********************************/
//			con = DriverManager.getConnection(url, "scott", "tiger");
			/*******************************************************************/

			/** My-SQL에서 Connection 객체 ***********************************/
			con = DriverManager.getConnection(url, "jspid", "jsppass" );
			/*******************************************************************/

			System.out.println("데이터베이스 연결 성공~!!");

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패~!!");
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
