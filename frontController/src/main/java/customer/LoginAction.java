package customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fw.Action;
// ==> /login.do로 요청했을 때 실행할 클래스
public class LoginAction implements Action {

	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("로그인처리하기");
	}

}
