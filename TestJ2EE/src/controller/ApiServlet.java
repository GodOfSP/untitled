package controller;

import com.alibaba.fastjson.JSON;
import module.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ApiServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		User user = new User("caojian","123435345");
		
		out.println(JSON.toJSONString(user));
		
		out.flush();
		out.close();
	}

}
