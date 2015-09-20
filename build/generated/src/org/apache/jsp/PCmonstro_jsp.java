package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PCmonstro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <title>Untitled Document</title>\n");
      out.write("    <link href=\"css/rodape.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"css/texte.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body background=\"plano de fundo.jpg\"> \n");
      out.write("               \n");
      out.write("    <div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "slider.jsp", out, false);
      out.write("\n");
      out.write("    </div>\t\t\n");
      out.write("</br>       \n");
      out.write("\n");
      out.write("<div id=\"menu\">\n");
      out.write("<ul>\n");
      out.write("<li> <a href=\"index.html.html\">Home</a></li>\n");
      out.write("<li><a href=\"Produtos.html\"\t>Produtos</a></li>\n");
      out.write("<li><a href=\"Faleconosco.html\">fale conosco</a></li>\n");
      out.write("<li><a href=\"Carrinho.html\">Meu carrinho</a></li>\n");
      out.write("</ul>\t\n");
      out.write("</div>\n");
      out.write("<br />\n");
      out.write("</br>\n");
      out.write("<img src=\"Produto.jpg\" alt=\"PCmosntro\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"descrisaoprod\">\n");
      out.write("<h3>CARACTERÍSTICA</h3><br />\n");
      out.write("<p>\n");
      out.write("- Computador projetado para jogos de última geração.<br />\n");
      out.write("- Desempenho do processador Intel Core i7 Quad Core com função Turbo Boost.<br />\n");
      out.write("- Suporte a OVERCLOCK do processador.<br />\n");
      out.write("- Suporte a NVIDIA SLI (aceita a instalação de mais uma placa de vídeo)<br />\n");
      out.write("- 16GB de memória para executar facilmente qualquer aplicativo ou jogo<br />\n");
      out.write("- Armazenamento com espaço de sobra para jogos, músicas e filmes.<br />\n");
      out.write("- Placa mãe com chipset Intel e componentes de qualidade.<br />\n");
      out.write("- Gabinete com excelente ventilação e muito espaço interno.<br />\n");
      out.write("- Sistema de refrigeração com Water Cooler.<br />\n");
      out.write("- Placa de vídeo Nvidia GTX que oferece qualidade máxima para jogos de última geração.<br />\n");
      out.write("- Fonte de potência real ultra silenciosa com PFC ativo e selo 80 plus.<br />\n");
      out.write("- Conexão HDMI para monitores e TVs.<br />\n");
      out.write("<br />\n");
      out.write("</p>\n");
      out.write("<h3>ESPECIFICAÇÕES</h3><br />\n");
      out.write("<p>\n");
      out.write("- Processador Intel Core i7 4790K 4,00GHz<br />\n");
      out.write("- Placa mãe GIGABYTE GA-Z97X-UD3H-BK Black Edition<br />\n");
      out.write("- Water Cooler Nepton 280L Cooler Master <br />\n");
      out.write("- Memória 16GB DDR3 1866MHz Kingston HYPER-X FURY Black (2X8GB)<br />\n");
      out.write("- Gravador de DVD/CD sata <br />\n");
      out.write("- SSD 240GB Kingston V300 Sata III 6GB/s <br />\n");
      out.write("- HD 2TB Wertern Digital Sata 3 7200RPM 64Mb<br />\n");
      out.write("- Gabinete Cooler Master COSMOS SE <br />\n");
      out.write("- Fonte EVGA 750W Reais Super Nova Modular<br />\n");
      out.write("- Placa de Vídeo Nvidia GTX 980 4GB DDR5 256 Bit <br />\n");
      out.write("- 2 Coolers 120mm LED Azul Frente, Cooler 120mm Traseiro<br />\n");
      out.write("</p>\n");
      out.write("<br />\n");
      out.write("<h3>INFORMAÇÕES ADICIONAIS</h3><br />\n");
      out.write("<p>\n");
      out.write("- Garantia: 12 meses peça por peça, o computador não vem com lacres e pode ser aberto.<br />\n");
      out.write("- Instalamos o Windows 7 Ultimate 64 bit para teste.<br />\n");
      out.write("- Mandamos todos os drivers e bios atualizados.<br />\n");
      out.write("- Testamos todos os computadores com Jogos para garantir o desempenho e taxa de FPS.<br />\n");
      out.write("- Enviamos o JOGO WARFACE instalado no PC.<br />\n");
      out.write("- Itens Inclusos: Manuais, CDs Drivers, cabo de força, Adaptador DVI/VGA e todas as caixas dos componentes.<br /><br />\n");
      out.write("\n");
      out.write("*** NUNCA LIGUE O SEU PC EM ESTABILIZADORES eles danificam a fonte do seu computador e você perde a garantia. ***<br />\n");
      out.write("Ligue na tomada ou em um filtro de linha, pois a fonte suporta as variações de energia da rede elétrica.<br />\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("</div>\n");
      out.write("    <div id=\"rodape\" align=\"center\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Rodape.jsp", out, false);
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
