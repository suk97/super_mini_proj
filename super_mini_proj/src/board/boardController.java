package board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/board")
public class boardController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");
		
		// 커맨드 패턴
		String command = request.getParameter("command");
		
		//
		if(command == null) {
			command = "list";
		}
		
		if(command.equals("list")) {
			list(request, response);
		} else if(command.equals("write")) {
			write(request, response);
		} else if(command.equals("read")) {
			read(request, response);
		} else if(command.equals("updateForm")) {
			updateForm(request, response);
		} else if(command.equals("update")) {
			update(request, response); 
		} else if(command.equals("delete")) {
			delete(request, response);
		}
	}

	private void list(HttpServletRequest request, HttpServletResponse response) {
		String url = "error.jsp";
		request.setAttribute("list", boardDAO.getAllContents());
		url = "list.jsp";
	}
	
	private void write(HttpServletRequest request, HttpServletResponse response) {
		// 형변환
		int num = request.getParameter("b_num");
		String title = request.getParameter("b_title");
		String contents = request.getParameter("b_contents");
		String date = request.getParameter("b_date");
		int mNum = request.getParameter("m_num");
		
		// 데이터값 입력 유무만 유효성 검증
		if(num == 0 ||
		title == null || title.trim().length()==0 ||
		contents == null || contents.trim().length()==0 ||
		date == null || date.trim().length()==0 ||
		mNum == 0 || ) {
			response.sendRedirect();
			return; // write 메소드 종료
		}
	}
	
	private void read(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void updateForm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	
	private void update(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
		
	private void delete(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
		
		
		
		
		
		
//	    ArrayList<HashMap<String, Object>> boardList;
//        int bNum;
//        String bTitle;
//        String bContents;
//        Date bDate;
//        int mNum;
	
//        request.getParameter("");
        // 서비스로 이동
        
        

}
