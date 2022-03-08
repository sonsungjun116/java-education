// 자바빈, DTO(Data Transfer Object)

package javaBean;

public class SimpleBean {

	private String name;
	private String msg;		// 프로퍼티

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;	  //왼쪽이 필드 오른쪽이 매개변수
	}
	
}
