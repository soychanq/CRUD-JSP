

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminando...</title>
        
    </head>
    <body>
      <%
           String cod = request.getParameter("codD");
          //declaraciòn de variables
           Connection con = null;
           ResultSet miResulSet = null;
           Statement SQL = null;
           try{
           //cadena de conexion
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection
           ("jdbc:mysql://localhost/mantenimiento?user=root&password=");
           //Ejecutar el statement
           SQL=con.createStatement();
           SQL.executeUpdate("DELETE FROM usuarios WHERE codigo='"+cod+"'");
           request.getRequestDispatcher("consult.jsp").forward(request, response);
           }catch(Exception e){}
        
       %>
        
    </body>
</html>
