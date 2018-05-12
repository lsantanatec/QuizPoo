<%-- 
   
--%>

<%@page import="br.com.fatepg.quiz.ControleDeSessao"%>
<%@page import="br.com.fatepg.quiz.Questoes"%>
<%@page import="br.com.fatepg.quiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Quiz</title>
    </head>
    <body>
        <h1>Web Quiz</h1>
        <form action = "home.jsp">
            <% for (int i=0;i<Quiz.getTeste().size(); i++){
                Questoes q = Quiz.getTeste().get(i); %>
                
                <h2><%=q.getQuestoes()%></h2>
                <input type="radio" name="<%=q.getQuestoes()%>" value="<%=q.getAlternativas()[0]%>"/><%=q.getAlternativas()[0]%>
                <input type="radio" name="<%=q.getQuestoes()%>" value="<%=q.getAlternativas()[1]%>"/><%=q.getAlternativas()[1]%>
                <input type="radio" name="<%=q.getQuestoes()%>" value="<%=q.getAlternativas()[2]%>"/><%=q.getAlternativas()[2]%>
                <%}%>
                <hr/>
                <input type="submit" name="tested" value="Enviar" />
        </form>
    </body>
</html>
