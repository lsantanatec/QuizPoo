<%-- 
    Document   : home
    Created on : 07/05/2018, 21:38:40
    Author     : a
--%>
<%@page import="java.util.ArrayList;"%>
<%@page import="br.com.fatepg.quiz.ControleDeSessao"%>
<%@page import="br.com.fatepg.quiz.Questoes"%>
<%@page import="br.com.fatepg.quiz.Quiz"%>
<%@page import="br.com.fatepg.quiz.TestesRealizados"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
    ArrayList<TestesRealizados> testes = new ArrayList<>();
    
    
    
    
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
                <% if (testes.size() > 0) { %>
                <table>
                    <tr>
                        <th>Nome</th><th>Nota</th><th>Data</th>
                    </tr>
                    <% for(int i=0;i<testes.size();i++){ %>
                    <tr>
                        <td><%= testes.get(i).getNomeUser() %></td>
                        <td><%= testes.get(i).getNota() %></td>
                        <td><%= testes.get(i).getDataTeste() %></td>
                    </tr>
                    <%}%>
                </table>
                <%}%>
           </div>
         
    </body>
</html>
