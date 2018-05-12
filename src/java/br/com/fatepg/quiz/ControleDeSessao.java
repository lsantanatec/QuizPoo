/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatepg.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 11/05/2018
 * @author ivanf
 */
@WebServlet(name = "ControleDeSessao", urlPatterns = {"/ControleDeSessao"})

public class ControleDeSessao extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{
            response.setContentType("text/html");
            HttpSession session=request.getSession(true);
            //String n=(String)session.getAttribute("uname");
            String n;
            
            if (request.getParameter("login") != null){
                request.getSession(true);
                System.out.println("Login "+session.isNew());
                n = request.getParameter("userName");
                System.out.println("nome: "+n);
                session.setAttribute("userName",n);
                System.out.println(session.getId());
                response.sendRedirect("home.jsp");
            }
            /*else if(request.getParameter("login") != null){
                System.out.println("Logout");
                session.invalidate();
                request.getSession(true);
                System.out.println("Login Novo User " +session.isNew());
                n = request.getParameter("userName");
                System.out.println("nome: "+n);
                session.setAttribute("userName",n);
                System.out.println(session.getId());
                response.sendRedirect("home.jsp");
            }*/
            else if(request.getParameter("logout") != null || request.getParameter("userNAme").equals(null)){
                System.out.println("Logout");
                session.invalidate();
                response.sendRedirect("home.jsp");
            }
            else if(request.getParameter("quiz") != null){
                System.out.println("Quiz");
                response.sendRedirect("home.jsp");
            }
            else{
                System.out.println("Trabson");
                request.setAttribute("userName", null);
                response.sendRedirect("home.jsp");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
