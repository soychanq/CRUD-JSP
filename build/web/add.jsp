<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title>
        <style>
            body{
                font-family: 'Roboto';
            }
        </style>
    </head>
    <body>
        <h2 align="center">Nuevo Producto</h2>
        <form action ="" autocomplete="off">
            <table border="0" width="250" align="center">
                <tr>
                    <td> Codigo: </td>    
                    <td> <input type ="text" name ="cod"> </td> 
                </tr>
                <tr>
                    <td> Nombre: </td>    
                    <td> <input type ="text" name ="name"> </td>  
                 </tr>
                 <tr>   
                    <td> Cantidad: </td>    
                    <td> <input type ="text" name ="quantity"> </td>  
                 </tr>
                 <tr>
                    <td> Categoria: </td>    
                    <td> <input type ="text" name ="category"> </td> 
                 </tr>
                 <tr>
                    <td> Costo: </td>    
                    <td> <input type ="text" name ="cost"> </td> 
                 </tr>
                 <tr>
                     <th colspan="2"> 
                         <input type ="submit" name ="btnGrabar" value ="Grabar"> </td> 
                 </tr>          
            </table>
        </form>
       <%
           String cod = request.getParameter("cod");
           String name = request.getParameter("name");
           String quantity = request.getParameter("quantity");
           String category = request.getParameter("category");
           String cost = request.getParameter("cost");
           //declaraciòn de variables
           Connection con = null;
           ResultSet miResulSet = null;
           Statement SQL = null;
           try{
           //cadena de conexion
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/mantenimiento?user=root&password=");
           //Ejecutar el statement
           SQL=con.createStatement();
           SQL.executeUpdate("INSERT INTO `usuarios` (`codigo`, `nombre`, `cantidad`, `categoria`, `precio`) VALUES ('"+cod+"','"+name+"','"+quantity+"','"+category+"','"+cost+"')");
           request.getRequestDispatcher("consult.jsp").forward(request, response);
           }catch(Exception e){} 
       %>
    </body>
</html>
