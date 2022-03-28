package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {	//인터페이스는 다중상속까지 허용함

	// 추상 메소드
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
