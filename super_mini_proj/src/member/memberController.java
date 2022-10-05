package member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/member")
public class memberController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		
		if(command == null) {
			board(request, response);
		}
		
		if (command == "login") {
			login(request, response);
		} else if (command == "join") {
			join(request, response);
		}
	}

	private void login(HttpServletRequest request, HttpServletResponse response) {
		String mId = request.getParameter("mId");
		String mPw = request.getParameter("mPw");
		
		MemberDTO member = memberDAO.login(new MemberDTO(0, "", mId, mPw, 0));
	
	}
	
	private void join(HttpServletRequest request, HttpServletResponse response) {
		
		
	}
 
	private void board(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	
	
}
