<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="java.sql.*" %>

<%
  Connection con=null;

  try{

/***************** My-SQL ���� �����ϴ� �κ� *****************************/
//    String driver = "com.mysql.jdbc.Driver";

//    String jdbcUrl = "jdbc:mysql://localhost:3306/jsptest";
//    String dbId = "jspid";
//    String dbPass = "jsppass";	
/************************************************************************/	


/**************** Oracle ���� �����ϴ� �κ� *****************************/
    String driver = "oracle.jdbc.driver.OracleDriver";  	

    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    String dbId = "scott";
    String dbPass = "tiger";
/************************************************************************/

	// JDBC ���
	Class.forName(driver);		// JDBC Driver Loading
	con=DriverManager.getConnection(jdbcUrl,dbId ,dbPass );
	
	out.println("����� ����Ǿ����ϴ�.");

	} catch(Exception e){ 

		e.printStackTrace();

	}
%>
