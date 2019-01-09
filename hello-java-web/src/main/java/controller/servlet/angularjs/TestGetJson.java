package controller.servlet.angularjs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(urlPatterns="/angular/3/json.do")
public class TestGetJson extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("kimi");
		
		List<String> list=new ArrayList<>();
		list.add("kimi");
		list.add("ralf");
		list.add("mika");
		list.add("juan");
		
		resp.getWriter().print(new Gson().toJson(list));
		resp.getWriter().flush();;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
