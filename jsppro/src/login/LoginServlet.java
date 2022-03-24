package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();	// 출력 스트림 객체
		
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		if(id.equals("java")&& passwd.equals("java")){	// 회원인증
			HttpSession session = request.getSession();	// 세션 객체
			session.setAttribute("id", id);	// 세션 공유 설정
			
			// 1. Dispatcher 방식으로 포워딩
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("./servlet/ex666/loginSuccess.jsp");	// webcontent폴더가 기준
			dispatcher.forward(request, response);
			
			// 2. Redirect 방식
//			response.sendRedirect("./servlet/ex666/loginSuccess.jsp");
			
		}
		else{	// 회원 인증 실패
			out.println("<script>");
			out.println("alert('아이디나 비밀번호가 일치하지 않습니다.')");
			out.println("history.back()");
			out.println("</script>");
		}
	}

}
