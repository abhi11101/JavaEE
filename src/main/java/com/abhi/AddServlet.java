package com.abhi;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k = i+j;
        System.out.println("Add is "+ k);
//        PrintWriter out = res.getWriter();
//        out.println("Result is " +k);
//
//        req.setAttribute("k",k);

//        RequestDispatcher rd = req.getRequestDispatcher("sq");  //Request Dispatcher
//        rd.forward(req,res);
//        res.sendRedirect("sq?k="+k);  // URL Rewriting

//        Session
//
//        HttpSession session = req.getSession();
//        session.setAttribute("k",k);
//
//        res.sendRedirect("sq");

        PrintWriter out = res.getWriter();
        ServletContext context = req.getServletContext();
        String str = context.getInitParameter("name");
        out.println("Servlet Context " + str);

        ServletConfig config = getServletConfig();
        str = config.getInitParameter("name");
        out.println("Servlet config " + str);
    }
}
