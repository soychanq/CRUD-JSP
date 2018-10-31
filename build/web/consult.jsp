
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
            td{
                background-color: #f4f5f7;
            }
            .text_white{
                color:white;
            }
        </style>
    </head>
    <body>
        <h1 align ="center">Productos</h1>
        <table border ="0" width="600" align ="center">
            <tr >
                <th colspan ="5">Listado de Productos</th>
                <th><a href="add.jsp">
                        <img src="Iconos/64/png/001-delivery-cart.png" width="50" height="50" alt=""/></a></th>
            </tr>
            <tr class="text_white" bgcolor=#172b4d>
                <th>ID</th> 
                <th>Nombre</th>
                <th>Cantidad</th>
                <th>Categoria</th>
                <th>Precio</th>
                <th>Accion</th>
            </tr>
        <%
            //declarar las variables
            Connection con = null;
            Statement SQL= null;
            ResultSet action= null;
            try{
            //conexion con la base de datos
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/mantenimiento?user=root&password=");
            SQL = con.createStatement();
            action = SQL.executeQuery("select * from usuarios");
            while(action.next()){
        %>
               <tr>
                   <th><%=action.getString(1)%></th> 
                   <td><%=action.getString(2)%></td> 
                   <td><%=action.getString(3)%></td> 
                   <td><%=action.getString(4)%></td> 
                   <th><%=action.getString(5)%></th> 
                   <td>
                       &nbsp;&nbsp;&nbsp;&nbsp;
                       <a href="delete.jsp?codD=<%=action.getString(1)%>" >
                        <img src="Iconos/64/png/002-delete.png" width="30" height="30">
                       </a>&nbsp;&nbsp;&nbsp;&nbsp;
                       <a href="edit.jsp?codD=<%=action.getString(1)%>" >
                        <img src="Iconos/64/png/003-edit.png" width="30" height="30">
                       </a>
                   </td>
               </tr> 
        <%    
            }
            SQL.close();
            action.close();
            con.close();

            }catch (Exception e){
            }
        
        %>
        </table>
    </body>
</html>
