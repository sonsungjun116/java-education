package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import model.MemberDTO;

public class UpdateMember implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("UpdateMember");
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		
		MemberDAO dao = MemberDAO.getInstance();
		MemberDTO member = dao.getMember(id);	//1명의 상세정보 구하기
		System.out.println("수정폼:"+member);
		
		String hobby = member.getHobby();		// "공부-게임-등산"
		String[] h = hobby.split("-");			// h[0]="공부", h[1]="게임"
		
		// 공유 설정
		request.setAttribute("member", member);
		request.setAttribute("h", h);
		
		
		ActionForward forward = new ActionForward();
		
		
		// request객체로 공유가 된 경우에는 반드시 dispatcher를 사용해야 한다.
		// view 페이지에서 그래야 공유한 값이 접근할 수 있다.
		forward.setRedirect(false);      //dispatcher방식으로 포워딩 여기서 true는 사용불가능
		forward.setPath("./member/updateform.jsp");
				
		return forward;
	}

}
