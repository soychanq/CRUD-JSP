package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class consult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Productos</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: 'Roboto';\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                background-color: #f4f5f7;\n");
      out.write("            }\n");
      out.write("            .text_white{\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align =\"center\">Productos</h1>\n");
      out.write("        <table border =\"0\" width=\"600\" align =\"center\">\n");
      out.write("            <tr >\n");
      out.write("                <th colspan =\"5\">Listado de Productos</th>\n");
      out.write("                <th><a href=\"add.jsp\">\n");
      out.write("                        <img src=\"Iconos/64/png/001-delivery-cart.png\" width=\"50\" height=\"50\" alt=\"\"/></a></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"text_white\" bgcolor=#172b4d>\n");
      out.write("                <th>ID</th> \n");
      out.write("                <th>Nombre</th>\n");
      out.write("                <th>Cantidad</th>\n");
      out.write("                <th>Categoria</th>\n");
      out.write("                <th>Precio</th>\n");
      out.write("                <th>Accion</th>\n");
      out.write("            </tr>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <th>");
      out.print(action.getString(1));
      out.write("</th> \n");
      out.write("                   <td>");
      out.print(action.getString(2));
      out.write("</td> \n");
      out.write("                   <td>");
      out.print(action.getString(3));
      out.write("</td> \n");
      out.write("                   <td>");
      out.print(action.getString(4));
      out.write("</td> \n");
      out.write("                   <th>");
      out.print(action.getString(5));
      out.write("</th> \n");
      out.write("                   <td>\n");
      out.write("                       &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                       <a href=\"delete.jsp?codD=");
      out.print(action.getString(1));
      out.write("\" >\n");
      out.write("                        <img src=\"Iconos/64/png/002-delete.png\" width=\"30\" height=\"30\">\n");
      out.write("                       </a>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                       <a href=\"edit.jsp?codD=");
      out.print(action.getString(1));
      out.write("\" >\n");
      out.write("                        <img src=\"Iconos/64/png/003-edit.png\" width=\"30\" height=\"30\">\n");
      out.write("                       </a>\n");
      out.write("                   </td>\n");
      out.write("               </tr> \n");
      out.write("        ");
    
            }
            SQL.close();
            action.close();
            con.close();

            }catch (Exception e){
            }
        
        
      out.write("\n");
      out.write("        </table>\n");
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
