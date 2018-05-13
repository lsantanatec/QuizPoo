<%-- 
    Document   : home
    Created on : 07/05/2018, 21:38:40
    Author     : a
--%>
<%@page import="br.com.fatepg.quiz.ControleDeSessao"%>
<%@page import="br.com.fatepg.quiz.Questoes"%>
<%@page import="br.com.fatepg.quiz.Quiz"%>
<%@page import="br.com.fatepg.quiz.TestesRealizados"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Quiz</title>
    </head>
    <body>
        <h1>Web Quiz</h1>
        
        <%  
        if(session.getAttribute("userName") != null){  
        String name=(String)session.getAttribute("userName"); 
        %>
        <h2>Bem vindo <%=name%></h2>
         
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
            <div>
                <h2>Ultimos 10</h2>
                <% if (TestesRealizados.last10geral.size() > 0) { %>
                <table>
                    <tr>
                        <th>Nome</th><th>Nota</th><th>Data</th>
                    </tr>
                    <% for(int i=0;i<TestesRealizados.last10geral.size();i++){ %>
                    <tr>
                        <td><%= TestesRealizados.getLast10geral().get(i).getNome() %></td>
                        <td><%= TestesRealizados.getLast10geral().get(i).getNota() %></td>
                        <td><%= TestesRealizados.getLast10geral().get(i).g %></td
                        
                        <td><%= TestesRealizados.getLast10geral().get(i).getNome() %></td
                                
                        
                    </tr>
                
                </table>
                <%}%>
           </div>
         
    </body>
</html>
