<%@page import="br.com.fatepg.quiz.TestesRealizados"%>
<%@page import="br.com.fatepg.quiz.ControleDeSessao"%>
<%@page import="br.com.fatepg.quiz.Questoes"%>
<%@page import="br.com.fatepg.quiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
    boolean tested=false;
    double grade=0;
    
    Quiz qu = new Quiz();
    if(request.getParameter("tested")!=null){
        System.out.println("resultado");
        tested=true;
        int cont = 0;
        for (int i=0;i<qu.teste.size(); i++){
            Questoes q = qu.teste.get(i);
            String p = request.getParameter(String.valueOf(i));
            System.out.println(p);
            System.out.println(q.getResposta());
            if (q.getResposta().equals(p)){
                cont=cont+1;
            }
        }
        grade = 100.0 * ((double)(cont)/qu.teste.size());
        Quiz quiz = new Quiz(session.getAttribute("userName").toString(), grade);
        TestesRealizados.last10Geral.add(quiz);
    }
    //session.getAttribute("uname");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Quiz</title>
    </head>
    <body>
        <h1>Web Quiz Resultado</h1>
        <% if (tested){ %>
        <h2>Você acertou <%=grade%>% das questões!</h2>
        <%}%>
        <br><br>
        <a href="home.jsp">Voltar</a>
    </body>
</html>