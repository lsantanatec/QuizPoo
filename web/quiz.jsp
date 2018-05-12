<%-- 
    Document   : quiz
    Created on : 07/05/2018, 21:38:59
    Author     : Lucas Monteiro
--%>

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
            
            <%int i = 0;
              int x = 0;
              int[] conf = new int [10];
              int random = 1 + (int) (Math.random() * 100);
                do{
                     random = 1 + (int) (Math.random() * 100);
                   
                    if(random >=0 && random <=20){
                
                    
                Questoes q = Quiz.getTeste().get(random);
                i++; 
                 %>
                
                <h2><%=q.getQuestoes()%></h2>
                <input type="radio" name="<%=q.getQuestoes()%>" value="<%=q.getAlternativas()[0]%>"/><%=q.getAlternativas()[0]%>
                <input type="radio" name="<%=q.getQuestoes()%>" value="<%=q.getAlternativas()[1]%>"/><%=q.getAlternativas()[1]%>
                <input type="radio" name="<%=q.getQuestoes()%>" value="<%=q.getAlternativas()[2]%>"/><%=q.getAlternativas()[2]%>
                <%}}while(i!=10);%>
                <hr/>
                <input type="submit" name="tested" value="Enviar" />
        </form>
    </body>
</html>