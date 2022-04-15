package memberservice;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import service.Action;
import service.ActionForward;

public class Idcheck implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Idcheck");
		
		request.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		String member_id = request.getParameter("member_id");
		System.out.println("id:"+member_id);
		
		MemberDAO dao = MemberDAO.getInstance();
		int result = dao.idcheck(member_id);			// ID 중복 검사
		System.out.println("result:"+result);	//  1 : 중복 ID
												// -1 : 사용 가능한 ID
		// 웹 브라우저에 출력되는 값이 callback 함수로 리턴된다.
		out.println(result);
		
		return null;
	}

}
