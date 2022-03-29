package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;

public class Login implements Action { //implements로 상속받는다면 부모의 추상메서드를 반드시 오버라이딩 해야한다.

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Login");
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();		// out객체,외우면 좋다
		HttpSession session = request.getSession();		//request와 세션은 붙어 다닌다.
		
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		MemberDAO dao = MemberDAO.getInstance();	//dao객체의 정적메소드 호출
		int result = dao.memberAuth(id,passwd);		//회원인증 그냥 값 두개를 매개변후로 넘기기로 함 원래는 세터 게터로
		if(result == 1)System.out.println("회원 인증 성공");
		
		if(result == 1) {		// 회원 인증 성공
			session.setAttribute("id", id);          // 세션 공유 설정
		}else {					// 회원 인증 실패
			out.println("<script>");
			out.println("alert('로그인 실패');");
			out.println("history.go(-1);");
			out.println("</script>");
			
			return null;
		}
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);     			// dispatcher 방식으로 포워딩
		forward.setPath("./member/main.jsp");		// 포워딩할 파일 설정 / 기준은 webcontent폴더이다.
		
		return forward;
	}

}
