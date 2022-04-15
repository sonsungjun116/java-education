package memberservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Action;
import service.ActionForward;

public class BuyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("BuyAction");
		
		request.setCharacterEncoding("utf-8");
		
		int b_num = Integer.parseInt(request.getParameter("book_num"));
		
		System.out.println("책번호 : "+b_num);
	
		
		
		
		
		ActionForward forward = new ActionForward();
		
		
		return forward;
	}

}
