package controller.servlet.angularjs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/angular/3/testAng.do")
public class TestAngularJS extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Kimi");
		System.out.println(req.getParameter("action"));
		
		PrintWriter out=resp.getWriter();
		out.print("<h1>I can use AngularJS to pass value into a servlet!</h1>");
		out.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Ralf");
		PrintWriter out=resp.getWriter();
		out.println("Kimi $ Mika");
		out.flush();
	}

}
