/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-08-21 09:26:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<title>用户登录</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<link href=\"res/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"res/assets/css/font-awesome.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"res/assets/css/ace.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"res/assets/css/ace-rtl.min.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"login-layout\">\r\n");
      out.write("\t<div class=\"main-container\">\r\n");
      out.write("\t\t<div class=\"main-content\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-10 col-sm-offset-1\">\r\n");
      out.write("\t\t\t\t\t<div class=\"login-container\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-leaf green\"></i> <span class=\"red\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"white\">费用管理系统</span>\r\n");
      out.write("\t\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"blue\"></h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"space-6\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"position-relative\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"login-box\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"login-box visible widget-box no-border\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"header blue lighter bigger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-coffee green\"></i> 请输入您的账号和密码\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"space-6\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"login.do\" method=\"post\" onsubmit=\"return check()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"block input-icon input-icon-right\"> <input id=\"userId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"userAccount\" type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"请输入账号\" /> <i class=\"icon-user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</label> <label class=\"block clearfix\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"block input-icon input-icon-right\"> <input id=\"userPw\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"userPassword\" type=\"password\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"请输入密码\" /> <i class=\"icon-lock\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"width-35 pull-right btn btn-sm btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-key\"></i> 登陆\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-4\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
