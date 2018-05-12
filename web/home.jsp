<%-- 
    Document   : home
    Created on : 07/05/2018, 21:38:40
    Author     : a
--%>

<%@page import="br.com.fatepg.quiz.ControleDeSessao"%>
<%@page import="br.com.fatepg.quiz.Questoes"%>
<%@page import="br.com.fatepg.quiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
    boolean tested=false;
    double grade=0;
    if(request.getParameter("tested")!=null){
        tested=true;
        int cont = 0;
        for (int i=0;i<Quiz.getTeste().size(); i++){
            Questoes q = Quiz.getTeste().get(i);
            String p = request.getParameter(q.getQuestoes());
            if (q.getResposta().equals(p))
                cont++;
        }
        grade = 100.0 * ((double)(cont)/Quiz.getTeste().size());
    }
    //session.getAttribute("uname");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Quiz</title>
    </head>
    <body>
        <h1>Web Quiz</h1>
        <% if (tested){ %>
        <h2>Você acertou <%=grade%>% das questões!</h2>
        <%}%>
        
        <%  
        if(session.getAttribute("userName") != null){  
        String name=(String)session.getAttribute("userName"); 
        %>
        <h2>Bem vindo <%=name%><h2>
         <%}%>
        <form action="ControleDeSessao">  
            <br/>  
            <%  
                if(session.getAttribute("userName") == null){ 
            %>
                Login:<input type="text" name="userName"/>
                <input type="submit" name=login  value="Entrar"/>
            <%}else{%>  
                <input type="submit" name=logout value="Sair"/>
                <input type="button" onclick="document.location.href='quiz.jsp'" value="Realizar Quiz"/>  
            <%}%>
        </form>  
    </body>
</html>
