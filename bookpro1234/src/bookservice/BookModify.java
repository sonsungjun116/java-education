package bookservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import model.BookDTO;
import service.Action;
import service.ActionForward;

public class BookModify implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("BookModify");
		
		int book_num = Integer.parseInt(request.getParameter("book_num"));
		String nowpage = request.getParameter("page");
		System.out.println(book_num);
		System.out.println(nowpage);
		
	//	int book_stock1 = Integer.parseInt(request.getParameter("book_stock"));
		
		
	//	System.out.println(book_stock1);
		
		BookDAO dao = BookDAO.getInstance();
		BookDTO book = dao.getDetailBook(book_num);
		
		request.setAttribute("book", book);
		request.setAttribute("page", nowpage);
	//	request.setAttribute("book_stock1",book_stock1);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./book/bookmodify.jsp");
		return forward;
	}

}
