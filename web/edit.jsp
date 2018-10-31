
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <h2 align="center">Editar de Usuario</h2>
          <%
          String codigoM = request.getParameter("codigop");
           //declarar las variables
            Connection conexion = null;
            Statement miStatement= null;
            ResultSet miResultSet= null;
            try{
            //conexion con la base de datos
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection
            ("jdbc:mysql://localhost/mantenimiento?user=root&password=");
            miStatement = conexion.createStatement();
            miResultSet = miStatement.executeQuery("select * from usuarios where codigo='"+codigoM+"'");
            while(miResultSet.next()){
          %>
        <form action ="">
            <table border="1" width="250" align="center">
                <tr>
                    <td> Codigo: </td>    
                    <td> <input type ="text" name ="txtCodigo" value="<%=miResultSet.getString(1)%>" readonly="readonly"> </td> 
                </tr>
                <tr>
                    <td> Nombre: </td>    
                    <td> <input type ="text" name ="txtNombre" value="<%=miResultSet.getString(2)%>"> </td>  
                 </tr>
                 <tr>   
                    <td> Edad: </td>    
                    <td> <input type ="text" name ="txtEdad" value="<%=miResultSet.getString(3)%>"> </td>  
                 </tr>
                 <tr>
                    <td> Sexo: </td>    
                    <td> <input type ="text" name ="txtSexo"value="<%=miResultSet.getString(4)%>"> </td> 
                 </tr>
                 <tr>
                    <td> Password: </td>    
                    <td> <input type ="text" name ="txtPassword" value="<%=miResultSet.getString(5)%>"> </td> 
                 </tr>
                 <tr>
                     <th colspan="2"> 
                         <input type ="submit" name ="btnGrabar" value ="Editar Usuario"> </td> 
                 </tr>          
                </tr>
            </table>
        </form>
            <%
            }
}catch (Exception e){}
           if (request.getParameter("btnGrabar")!=null){
           String codigop = request.getParameter("txtCodigo");
           String nombrep = request.getParameter("txtNombre");
           String edadp = request.getParameter("txtEdad");
           String sexop = request.getParameter("txtSexo");
           String passwordp = request.getParameter("txtPassword");

           miStatement.executeUpdate("update usuarios set nombre='"+nombrep+"',edad='"+edadp+"',sexo='"+sexop+"',password='"+passwordp+"' where codigo='"+codigop+"'");
           request.getRequestDispatcher("consulta.jsp").forward(request, response);

    }
            %>                   
    </body>
</html>
