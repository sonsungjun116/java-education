package beans;


public class LoginBean {	
	
	private String userid; //로그인폼에서 전달된 값
	private String passwd;

	private String _userid; // 디폴트값
	private String _passwd;
	
	// 생성자 --> 객체가 생성될때 자동으로 호출된다
	public LoginBean() {
		// 인증에 사용할 기본값 설정
		_userid = "myuser";
		_passwd = "1234";
	}
	
	// 아이디와 비밀번호가 맞는지 체크하는 메서드
	public boolean checkUser() {
		if(userid.equals(_userid) && passwd.equals(_passwd))
			return true;
		else
			return false;
	}		
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}	
	
	public String getUserid() {
		return userid;
	}
	
	public String getPasswd() {
		return passwd;
	}
}