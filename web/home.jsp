<%-- 
    Document   : home
    Created on : 07/05/2018, 21:38:40
    Author     : a
--%>

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
        <h2><a href="quiz.jsp">Realizar QUIZ</a></h2>
    </body>
</html>
