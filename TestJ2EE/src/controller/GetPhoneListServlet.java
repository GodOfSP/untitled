package controller;

import com.alibaba.fastjson.JSON;
import module.BaseResult;
import module.User;
import module.service.PhoneService;
import module.service.impl.PhoneServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetPhoneListServlet")
public class GetPhoneListServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;
    PhoneService phoneService = new PhoneServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAll(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doAll(req,resp);
    }

    private void doAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        try {
            out.println(JSON.toJSONString(new BaseResult("200","查询成功!",phoneService.getPhoneList())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.flush();
        out.close();
    }
}
