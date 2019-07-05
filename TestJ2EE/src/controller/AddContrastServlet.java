package controller;

import com.alibaba.fastjson.JSON;
import module.BaseResult;
import module.service.AddContrastService;
import module.service.impl.AddContrastServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddContrastServlet")
public class AddContrastServlet extends HttpServlet {

    private AddContrastService contrastService = new AddContrastServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAll(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAll(request,response);
    }

    private void doAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int res = 0;
        String msg = "";
        try {
            res = contrastService.addContrast(request.getParameter("userId"), request.getParameter("phoneId"));
            if (res == 1) {
                msg = "操作成功!";
            } else {
                msg = "操作失败!";
            }
        } catch (Exception e) {
            e.printStackTrace();
            msg = "操作失败!";
        }
        PrintWriter out = response.getWriter();
        BaseResult baseResult = new BaseResult(res + "", msg, msg);
        out.println(JSON.toJSONString(baseResult));

        out.flush();
        out.close();
    }
}
