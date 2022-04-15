package bookservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import model.BookDTO;
import service.Action;
import service.ActionForward;

public class BookInsert implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("BookInsert");
		
		request.setCharacterEncoding("utf-8");
		
		BookDTO book = new BookDTO();
		book.setBook_name(request.getParameter("book_name"));
		book.setBook_author(request.getParameter("book_author"));
		book.setBook_price(Integer.parseInt(request.getParameter("book_price")));
		book.setBook_stock(Integer.parseInt(request.getParameter("book_stock")));
		book.setBook_pb(request.getParameter("book_pb"));
		book.setBook_category(request.getParameter("book_category"));
		book.setBook_content(request.getParameter("book_content"));

		BookDAO dao = BookDAO.getInstance();
		
		int result = dao.BookInsert(book);
		
		if(result == 1)	System.out.println("도서 등록 성공");
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);  				// dispatcher 방식 포워딩
		forward.setPath("./book/AdminView.jsp");  // 포워딩할 파일명
		
		return forward;
	}
	

}
