package controller.servlet.angularjs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(urlPatterns="/angular/3/json2.do")
public class TestJson2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(this.getClass().getSimpleName());
		List<Map<String,String>> list=new ArrayList<>();
		Map<String,String> m=new HashMap<>();
		m.put("name","kimi");
		m.put("team","mclaren");
		list.add(m);
		m=new HashMap<>();
		m.put("name","ralf");
		m.put("team","williams");
		list.add(m);
		
		resp.setContentType("application/json");
		resp.getWriter().print(new Gson().toJson(list));
		resp.getWriter().flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

}
