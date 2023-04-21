package kr.multicampus.erp.user;

import java.util.ArrayList;

public interface EmpDAO {
	//사원등록을 위한 메소드
	public int insert(EmpDTO user);
	//전체사원 목록을 조회하는 메소드
	public ArrayList<EmpDTO> select();
	//사원목록을 삭제하는 메소드
	public int delete(String id);
	
	
		
}
