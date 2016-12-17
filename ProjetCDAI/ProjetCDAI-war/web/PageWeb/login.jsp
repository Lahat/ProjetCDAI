<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr"
  xmlns:h="http://java.sun.com/jsf/html"

    xmlns:p="http://primefaces.org/ui">
    <head>
    
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>

    <meta charset="utf-8"></meta>
    <title>TP2 </title>
     <%@include file="Templates/styleinitial.xhtml" %>
    </head>
    <body>
        <form name="firstForm" action="affichage.jsp" style="width:50%;margin:auto;background-color:#c1d9fc;padding-bottom:15px;" method="post" >
                 
        <h2 style="text-align:center;color:white;background-color:#6683b1;">Authentification</h2>
        <fieldset>
        <label>Nom :</label> 
                        <input type="text" name="login" />
        <label>Mot de Passe :</label> 
                        <input type="password" name="pwd" />
        <input type="submit" name="valider" value="Valider"/>            <input type="reset" name="effacer" value="Effacer"/>
         </fieldset>
     
    <%
    String login = request.getParameter("login");
    String password = request.getParameter("pwd");

    HttpSession sess = request.getSession();
    sess.setAttribute("login", login);
    sess.setAttribute("pwd", password);
	%>
    </form>
    </body>
</html>