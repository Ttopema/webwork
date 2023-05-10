package product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fw.Action;

public class ShoppingCart implements Action {
	
	//여기다가 기능을 정의??
	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("장바구니 추가하기 기능 수행");
	}

}
