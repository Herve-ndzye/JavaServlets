package com.mavic.learningtomcat;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SumServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int sum = num1 + num2;
        ServletConfig con = getServletConfig();
        String adminEmail = con.getInitParameter("admin_email");
        ServletContext context = getServletContext();
        String contextPath = context.getInitParameter("app_name");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("Sum is: " + sum);
        out.println("admin email is: " + adminEmail);
        out.println("app name is: " + contextPath);

        //use dispatch request to use radio to choose sum or add and
        // then depending on choice you direct her to the right response
    }

}
