package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Faleconosco_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>fale conosco</title>\n");
      out.write("        <link href=\"css/texte.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body> \n");
      out.write("    <div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "slider.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("\t\t\n");
      out.write("</br>        \n");
      out.write("\n");
      out.write("<div id=\"menu\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("<li><a href=\"Produtos.jsp\">Produtos</a></li>\n");
      out.write("<li><a href=\"Faleconosco.jsp\">fale conosco</a></li>\n");
      out.write("<li><a href=\"Carrinho.jsp\">Meu carrinho</a></li>\n");
      out.write("</ul>\t\n");
      out.write("</div>\n");
      out.write("<br/>\n");
      out.write("<br/>\n");
      out.write("<div id=\"numeros\">\n");
      out.write("<h1>Numero de telefones :</h1>\n");
      out.write("<br /><br />\n");
      out.write("<strong>Tel :</strong> 9090-9090<br />\n");
      out.write("<strong>End :</strong> R.Jose Antonio n.200<br /><br />\n");
      out.write("\n");
      out.write("<strong>Tel :</strong> 7070-7070<br />\n");
      out.write("<strong>End :</strong> R.Jose Antonio n.400<br /><br />\n");
      out.write("\n");
      out.write("<strong>Tel :</strong> 7171-7171 <br />\n");
      out.write("<strong>End :</strong> R. Jose Antonio n. 500<br />\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("\n");
      out.write("    <div id=\"rodape\" align=\"center\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "rodape.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
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
