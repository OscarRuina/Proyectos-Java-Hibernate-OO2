<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="datos.Cliente" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>Sistema Frances</title>
</head>
<body>
 <%@ include file="/cabecera.jsp" %>
 <% Cliente c = (Cliente)request.getAttribute("cliente"); %>
 <br>
   apellido: <%= c.getApellido() %><br>
   nombre: <%= c.getNombre() %><br>
   DNI: <%= c.getDni() %><br>
   ID: <%= c.getIdCliente() %><br>
   <br>
 <a href="/SistemaFrances/index.jsp">Volver...</a>    
</body>
</html>