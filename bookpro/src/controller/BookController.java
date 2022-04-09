package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Action;
import service.ActionForward;
import bookservice.BookInsert;
import bookservice.BookListAction;

@WebServlet("*.pdo")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());

		System.out.println("requestURI:" + requestURI);
		System.out.println("contextPath:" + contextPath);
		System.out.println("command:" + command);

		Action action = null;
		ActionForward forward = null;

		// 기능 추가

		// 상품등록폼
		if (command.equals("/BookAdd.pdo")) {
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./book/bookaddview.jsp");

		// 상품등록
		} else if (command.equals("/BookInsert.pdo")) {
			try {
				action = new BookInsert();
				forward = action.execute(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}

		// 상품 목록

		}else if(command.equals("/BookListAction.pdo")) {
			try {
				action = new BookListAction();
				forward = action.execute(request, response);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		

		// 포워딩 처리
		if (forward != null) {
			if (forward.isRedirect()) { // redirect 방식으로 포워딩
				response.sendRedirect(forward.getPath());
			} else { // dispatcher 방식으로 포워딩
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}

	} // doProcess end

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("get");
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post");
		doProcess(request, response);

	}

}
