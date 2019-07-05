package controller;

import com.alibaba.fastjson.JSON;
import module.BaseResult;
import module.service.delContastService;
import module.service.impl.delContrastServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DelContrastServlet extends HttpServlet {

    private delContastService delContastService = new delContrastServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAll(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAll(request,response);
    }

    private void  doAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        try {
            out.println(JSON.toJSONString(new BaseResult("200","操作成功！",delContastService.delContrast(request.getParameter("cId")))));
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.flush();
        out.close();
    }
}