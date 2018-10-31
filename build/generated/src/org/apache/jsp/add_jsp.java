package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Productos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2 align=\"center\">Nuevo Producto</h2>\n");
      out.write("        <form action =\"\" autocomplete=\"off\">\n");
      out.write("            <table border=\"0\" width=\"250\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td> Codigo: </td>    \n");
      out.write("                    <td> <input type =\"text\" name =\"cod\"> </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Nombre: </td>    \n");
      out.write("                    <td> <input type =\"text\" name =\"name\"> </td>  \n");
      out.write("                 </tr>\n");
      out.write("                 <tr>   \n");
      out.write("                    <td> Cantidad: </td>    \n");
      out.write("                    <td> <input type =\"text\" name =\"quantity\"> </td>  \n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td> Categoria: </td>    \n");
      out.write("                    <td> <input type =\"text\" name =\"category\"> </td> \n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td> Costo: </td>    \n");
      out.write("                    <td> <input type =\"text\" name =\"cost\"> </td> \n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <th colspan=\"2\"> \n");
      out.write("                         <input type =\"submit\" name =\"btnGrabar\" value =\"Grabar\"> </td> \n");
      out.write("                 </tr>          \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("       ");

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
           con=DriverManager.getConnection
           ("jdbc:mysql://localhost/mantenimiento?user=root&password=");
           //Ejecutar el statement
           SQL=con.createStatement();
           SQL.executeUpdate("insert into usuarios values ('"+cod+"','"+name+"','"+quantity+"','"+category+"','"+cost+"')");
           request.getRequestDispatcher("consulta.jsp").forward(request, response);
           }catch(Exception e){} 
       
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
