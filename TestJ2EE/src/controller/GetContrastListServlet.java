package controller;

import com.alibaba.fastjson.JSON;
import module.BaseResult;
import module.service.getContrastListService;
import module.service.impl.getContrastListServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetContrastListServlet")
public class GetContrastListServlet extends HttpServlet {

    private getContrastListService contrastListService = new getContrastListServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAll(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAll(request,response);
    }

    private void  doAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        try {
            out.println(JSON.toJSONString(new BaseResult("200","查询成功！",contrastListService.getContrastList(request.getParameter("userId")))));
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.flush();
        out.close();
    }
}
