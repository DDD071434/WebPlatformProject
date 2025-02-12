
package ohgym.teacher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import ohgym.request.Request;

@WebServlet("/profile")
public class TeacherProfileServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");

		TeacherService service = new TeacherServiceImpl(new TeacherDAOImpl());
		String id = "경태";
		
		List<TeacherProfile> teacherprofile = service.readTeacherProfile(id);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(teacherprofile.get(0));
		PrintWriter pw = resp.getWriter();
		System.out.println(json);
		pw.println(json);
		pw.flush();
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BufferedReader reader = req.getReader();
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		ObjectMapper mapper = new ObjectMapper();
		String strProfile = sb.toString();
		TeacherProfile teacherProfile = mapper.readValue(strProfile, TeacherProfile.class);
		
		TeacherService service = new TeacherServiceImpl(new TeacherDAOImpl());
		String exerciseType = service.convertExerciseToExerciseType(teacherProfile.getExercise());
		teacherProfile.setExercise(exerciseType);
		service.updateTeacherProfile(teacherProfile);
		
//		System.out.println(teacherProfile);
	}
}
