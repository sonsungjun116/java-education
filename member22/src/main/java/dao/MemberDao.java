package dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Member;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDao {
	
	private SqlSession getSession() {
		SqlSession session=null;
		Reader reader=null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
			session = sf.openSession(true);			// auto commit
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return session;
	}

	public int insert(Member member) {
		int result = 0;
		SqlSession session=null;
		try { 
			session = getSession(); 
			result = session.insert("insert", member);	 // insert는 member.xml에서 가지고 옴
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	public int chk(Member member) {
		int result = 0;
		SqlSession session=null;
		try { 
			session = getSession(); 
			Member mem = (Member) session.selectOne("select", member.getId()); //id select의 member dto의 id값만 전달
			if (mem.getId().equals(member.getId())) {
				result = -1;		// 아이디 일치
				if (mem.getPassword().equals(member.getPassword())) {
					result = 1;		// 비번까지 일치
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	public Member select(String id) throws SQLException {
		Member mem = null;
		SqlSession session=null;
		try { session = getSession(); 
		mem = (Member) session.selectOne("select", id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return mem;
	}

	public List<Member> list() {
		List<Member> list = new ArrayList<Member>();
		SqlSession session=null;
		try { session = getSession(); 
			list = session.selectList("list");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public int delete(String id) {
		int result = 0;
		SqlSession session=null;
		try { session = getSession(); 
			result = session.delete("delete", id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	public int update(Member mem) {
		int result = 0;
		SqlSession session=null;
		try { session = getSession(); 
			result = session.update("update", mem);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
}
