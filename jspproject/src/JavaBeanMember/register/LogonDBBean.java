// DAO(Data Access Object)

package JavaBeanMember.register;

public class LogonDBBean {

	// 싱글톤 : 객체 생성을 한번만 수행 하는 것.
	private static LogonDBBean instance = new LogonDBBean();
	
	public static LogonDBBean getInstance() {
		return instance;
	}
	
	// 회원가입 
}
