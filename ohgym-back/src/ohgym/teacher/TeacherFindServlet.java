package ohgym.teacher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;


@WebServlet("/find")
public class TeacherFindServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "*");
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		TeacherService service = new TeacherServiceImpl(new TeacherDAOImpl());
		List<TeacherProfile> list = service.readAllTeacherProfile();
		System.out.println(list);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(list); 
//      
//		PrintWriter pw = resp.getWriter();
//		pw.println(json);
//		pw.flush();
		
		
		req.setAttribute("list", json);
		req.getAttribute("list");
		System.out.println(req.getAttribute("list"));
		req.getRequestDispatcher("/jsp/find.jsp").forward(req, resp);
	}
}
