package controller.servlet.angularjs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

@WebServlet(urlPatterns="/angular/3/getSql1.do")
public class TestSql1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		System.out.println("kimi ajs sql");
		System.out.println("post data="+req.getParameter("test"));
		
		/*This is a TEST code, in other situations you should NOT write jdbc like this.*/
		String url="";
		String name="";
		String pw="";
		Map<String,Object> map=new LinkedHashMap<>();
		List<Map<String,Object>> list=new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			try {
				throw new SQLException();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		try (
				Connection conn=DriverManager.getConnection(url,name,pw);
				PreparedStatement ps=conn.prepareStatement("select * from product");
				ResultSet rs=ps.executeQuery();
				)
		{
			
			ResultSetMetaData md=rs.getMetaData();
			while(rs.next()) {
				map=new LinkedHashMap<>();
				for(int i=1;i<=md.getColumnCount();i++) {
					map.put(md.getColumnName(i),rs.getObject(i));
				}
				list.add(map);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("1="+list);
		System.out.println("2="+new JSONArray(list));
		System.out.println("3="+new Gson().toJson(list));
		System.out.println("4="+new Gson().toJson(new JSONArray(list)));
		resp.getWriter().print(new Gson().toJson(new JSONArray(list)));
		resp.getWriter().flush();
		
	}

}
