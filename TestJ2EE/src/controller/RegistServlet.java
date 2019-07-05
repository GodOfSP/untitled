package controller;

import com.alibaba.fastjson.JSON;
import module.BaseResult;
import module.User;
import module.service.UserService;
import module.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class RegistServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	UserService service = new UserServiceImpl();


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		User user = new User(userName,password);
		String msg = "";
		try {
			boolean b = service.saveUser(user);
			if (b) {
				msg = "注册成功!" ;
			} else {
				msg = "注册失败!";
			}
		} catch (Exception e) {
			e.printStackTrace();
			msg = "注册失败!";
		}
		PrintWriter out = response.getWriter();
		try {
			out.println(JSON.toJSONString(new BaseResult("200",msg,service.getUserId(userName))));
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.flush();
		out.close();
	}

}
