package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.multicampus.erp.user.EmpDAO;
import kr.multicampus.erp.user.EmpDAOImpl;
import kr.multicampus.erp.user.EmpDTO;

@WebServlet(name = "empInsert", urlPatterns = {"/emp/insert.do"}) // url패턴은 항상 .이나 / 로 시작
public class EmpInsertServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		//1.요청정보 추출하기 - 입력하는 값
		String deptno = req.getParameter("deptno");
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String addr = req.getParameter("addr");
		String grade = req.getParameter("grade");
		//2. 비지니스 메소드 호출
		EmpDTO user = new EmpDTO(deptno, name, id, pass, addr, grade);
		EmpDAO dao = new EmpDAOImpl();
		int result = dao.insert(user);
		
		//3.클라이언트에 응답
//		if(result>0) {
//			pw.println("<h1>사원등록성공</h1>");
//		}
//		else {
//			pw.println("<h1>사원등록실패</h1>");
//		}
//	
		//서블릿에서 바로 응답화면을 만들지 않고 응답할 뷰를 지정해서 실행되도록 처리
		String view =""; //응답할 뷰에 대한 정보
		if(result > 0) { //정상처리
			view = "/serverweb/user/insertOK.html";
		}
		else { //삽입실패
			view = "/serverweb/user/insertFail.html";
		}
		//응답뷰가 클라이언트에게 response되도록 재요청
		resp.sendRedirect(view);
	}

	
}
