package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.membership.MemberImpl;

import service.Action;
import service.ActionForward;
import service.Idcheck;
import service.MemberInsert;

@WebServlet("*.do")  // do 확장자로 요청하는 요청을 받겠다는 의미
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// doGet(), doPost() 메소드에서 공통적인 작업을 처리하는 메소드
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		System.out.println("requestURI:"+requestURI);   // /model2member/MemberInsert.do
		System.out.println("contextPath:"+contextPath); // /model2member
		System.out.println("command:"+command);         // /MemberInsert.do
		
		Action action = null;
		ActionForward forward = null;
		
		// 회원 가입
		if(command.equals("/MemberInsert.do")) {
			try {
				action = new MemberInsert();	//왼쪽은 부모 오른쪽은 자식이므로 업캐스팅임
				forward = action.execute(request, response); // MemberInsert에 오버라이딩된 execute메서드
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		// ID중복 검사(ajax)
		}else if(command.equals("/Idcheck.do")) {
			try {
				action = new Idcheck();
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			// 회원가입 폼
		}else if(command.equals("/MemberForm.do")) {
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./member/memberform.jsp");
		}
		
		
		// 포워딩 처리
		if(forward != null) {
			if(forward.isRedirect()) {	// redirect 방식으로 포워딩 (true)
				response.sendRedirect(forward.getPath());
			}else {						// dispatcher 방식으로 포워딩 (false) request객체로 공유된경우 반드시 dispatcher로 사용해야함
				RequestDispatcher dispatcher = 
						request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}		
		
	} // doProcess() end	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get");
		
		doProcess(request, response);  // doProcess() 메소드 호출
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post");
		
		doProcess(request, response);  // doProcess() 메소드 호출
	}

}
