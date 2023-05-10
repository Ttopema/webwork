package customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fw.Action;
// ==> customer/insert.do로 요청했을 때 실행할 클래스
public class InsertAction implements Action{

	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("insert처리하기");
		//요청정보를 추출해서 dao의 insert메소드를 호출
	}

}
