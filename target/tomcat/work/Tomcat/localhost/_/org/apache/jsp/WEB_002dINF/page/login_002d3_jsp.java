/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-02-02 06:36:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_002d3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>后台管理-登陆</title>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("    <meta http-equiv=\"Access-Control-Allow-Origin\" content=\"*\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("    <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n");
      out.write("    <meta name=\"format-detection\" content=\"telephone=no\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/lib/layui-v2.6.3/css/layui.css\" media=\"all\">\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"https://cdn.staticfile.org/html5shiv/r29/html5.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <style>\n");
      out.write("        .main-body {top:50%;left:50%;position:absolute;-webkit-transform:translate(-50%,-50%);-moz-transform:translate(-50%,-50%);-ms-transform:translate(-50%,-50%);-o-transform:translate(-50%,-50%);transform:translate(-50%,-50%);overflow:hidden;}\n");
      out.write("        .login-main .login-bottom .center .item input {display:inline-block;width:227px;height:22px;padding:0;position:absolute;border:0;outline:0;font-size:14px;letter-spacing:0;}\n");
      out.write("        .login-main .login-bottom .center .item .icon-1\n");
      out.write("        {background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/icon-login.png) no-repeat 1px 0;}\n");
      out.write("        .login-main .login-bottom .center .item .icon-2 {background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/icon-login.png) no-repeat -54px 0;}\n");
      out.write("        .login-main .login-bottom .center .item .icon-3 {background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/icon-login.png) no-repeat -106px 0;}\n");
      out.write("        .login-main .login-bottom .center .item .icon-4 {background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/icon-login.png) no-repeat 0 -43px;position:absolute;right:-10px;cursor:pointer;}\n");
      out.write("        .login-main .login-bottom .center .item .icon-5 {background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/icon-login.png) no-repeat -55px -43px;}\n");
      out.write("        .login-main .login-bottom .center .item .icon-6 {background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/icon-login.png) no-repeat 0 -93px;position:absolute;right:-10px;margin-top:8px;cursor:pointer;}\n");
      out.write("        .login-main .login-bottom .tip .icon-nocheck {display:inline-block;width:10px;height:10px;border-radius:2px;border:solid 1px #9abcda;position:relative;top:2px;margin:1px 8px 1px 1px;cursor:pointer;}\n");
      out.write("        .login-main .login-bottom .tip .icon-check {margin:0 7px 0 0;width:14px;height:14px;border:none;background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/icon-login.png) no-repeat -111px -48px;}\n");
      out.write("        .login-main .login-bottom .center .item .icon {display:inline-block;width:33px;height:22px;}\n");
      out.write("        .login-main .login-bottom .center .item {width:288px;height:35px;border-bottom:1px solid #dae1e6;margin-bottom:35px;}\n");
      out.write("        .login-main {width:428px;position:relative;float:left;}\n");
      out.write("        .login-main .login-top {height:117px;background-color:#148be4;border-radius:12px 12px 0 0;font-family:SourceHanSansCN-Regular;font-size:30px;font-weight:400;font-stretch:normal;letter-spacing:0;color:#fff;line-height:117px;text-align:center;overflow:hidden;-webkit-transform:rotate(0);-moz-transform:rotate(0);-ms-transform:rotate(0);-o-transform:rotate(0);transform:rotate(0);}\n");
      out.write("        .login-main .login-top .bg1 {display:inline-block;width:74px;height:74px;background:#fff;opacity:.1;border-radius:0 74px 0 0;position:absolute;left:0;top:43px;}\n");
      out.write("        .login-main .login-top .bg2 {display:inline-block;width:94px;height:94px;background:#fff;opacity:.1;border-radius:50%;position:absolute;right:-16px;top:-16px;}\n");
      out.write("        .login-main .login-bottom {width:428px;background:#fff;border-radius:0 0 12px 12px;padding-bottom:53px;}\n");
      out.write("        .login-main .login-bottom .center {width:288px;margin:0 auto;padding-top:40px;padding-bottom:15px;position:relative;}\n");
      out.write("        .login-main .login-bottom .tip {clear:both;height:16px;line-height:16px;width:288px;margin:0 auto;}\n");
      out.write("        body {background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/loginbg.png) 0% 0% / cover no-repeat;position:static;font-size:12px;}\n");
      out.write("        input::-webkit-input-placeholder {color:#a6aebf;}\n");
      out.write("        input::-moz-placeholder {/* Mozilla Firefox 19+ */            color:#a6aebf;}\n");
      out.write("        input:-moz-placeholder {/* Mozilla Firefox 4 to 18 */            color:#a6aebf;}\n");
      out.write("        input:-ms-input-placeholder {/* Internet Explorer 10-11 */            color:#a6aebf;}\n");
      out.write("        input:-webkit-autofill {/* 取消Chrome记住密码的背景颜色 */            -webkit-box-shadow:0 0 0 1000px white inset !important;}\n");
      out.write("        html {height:100%;}\n");
      out.write("        .login-main .login-bottom .tip {clear:both;height:16px;line-height:16px;width:288px;margin:0 auto;}\n");
      out.write("        .login-main .login-bottom .tip .login-tip {font-family:MicrosoftYaHei;font-size:12px;font-weight:400;font-stretch:normal;letter-spacing:0;color:#9abcda;cursor:pointer;}\n");
      out.write("        .login-main .login-bottom .tip .forget-password {font-stretch:normal;letter-spacing:0;color:#1391ff;text-decoration:none;position:absolute;right:62px;}\n");
      out.write("        .login-main .login-bottom .login-btn {width:288px;height:40px;background-color:#1E9FFF;border-radius:16px;margin:24px auto 0;text-align:center;line-height:40px;color:#fff;font-size:14px;letter-spacing:0;cursor:pointer;border:none;}\n");
      out.write("        .login-main .login-bottom .center .item .validateImg {position:absolute;right:1px;cursor:pointer;height:36px;border:1px solid #e6e6e6;}\n");
      out.write("        .footer {left:0;bottom:0;color:#fff;width:100%;position:absolute;text-align:center;line-height:30px;padding-bottom:10px;text-shadow:#000 0.1em 0.1em 0.1em;font-size:14px;}\n");
      out.write("        .padding-5 {padding:5px !important;}\n");
      out.write("        .footer a,.footer span {color:#fff;}\n");
      out.write("        @media screen and (max-width:428px) {.login-main {width:360px !important;}\n");
      out.write("            .login-main .login-top {width:360px !important;}\n");
      out.write("            .login-main .login-bottom {width:360px !important;}\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main-body\">\n");
      out.write("    <div class=\"login-main\">\n");
      out.write("        <div class=\"login-top\">\n");
      out.write("            <span>LayuiMini后台登录</span>\n");
      out.write("            <span class=\"bg1\"></span>\n");
      out.write("            <span class=\"bg2\"></span>\n");
      out.write("        </div>\n");
      out.write("        <form class=\"layui-form login-bottom\">\n");
      out.write("            <div class=\"center\">\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <span class=\"icon icon-2\"></span>\n");
      out.write("                    <input type=\"text\" name=\"username\" lay-verify=\"required\"  placeholder=\"请输入登录账号\" maxlength=\"24\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <span class=\"icon icon-3\"></span>\n");
      out.write("                    <input type=\"password\" name=\"password\" lay-verify=\"required\"  placeholder=\"请输入密码\" maxlength=\"20\">\n");
      out.write("                    <span class=\"bind-password icon icon-4\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"validatePanel\" class=\"item\" style=\"width: 137px;\">\n");
      out.write("                    <input type=\"text\" name=\"captcha\" placeholder=\"请输入验证码\" maxlength=\"4\">\n");
      out.write("                    <img id=\"refreshCaptcha\" class=\"validateImg\"  src=\"../images/captcha.jpg\" >\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"tip\">\n");
      out.write("                <span class=\"icon-nocheck\"></span>\n");
      out.write("                <span class=\"login-tip\">保持登录</span>\n");
      out.write("                <a href=\"javascript:\" class=\"forget-password\">忘记密码？</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"layui-form-item\" style=\"text-align:center; width:100%;height:100%;margin:0px;\">\n");
      out.write("                <button class=\"login-btn\" lay-submit=\"\" lay-filter=\"login\">立即登录</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"footer\">\n");
      out.write("    &copy;版权所有 2014-2018 叁贰柒工作室<span class=\"padding-5\">|</span><a target=\"_blank\" href=\"http://www.miitbeian.gov.cn\">粤ICP\n");
      out.write("    备16006642号-2</a>\n");
      out.write("</div>\n");
      out.write("<script src=\"../lib/layui-v2.6.3/layui.js\" charset=\"utf-8\"></script>\n");
      out.write("<script>\n");
      out.write("    layui.use(['form','jquery'], function () {\n");
      out.write("        var $ = layui.jquery,\n");
      out.write("            form = layui.form,\n");
      out.write("            layer = layui.layer;\n");
      out.write("\n");
      out.write("        // 登录过期的时候，跳出ifram框架\n");
      out.write("        if (top.location != self.location) top.location = self.location;\n");
      out.write("\n");
      out.write("        $('.bind-password').on('click', function () {\n");
      out.write("            if ($(this).hasClass('icon-5')) {\n");
      out.write("                $(this).removeClass('icon-5');\n");
      out.write("                $(\"input[name='password']\").attr('type', 'password');\n");
      out.write("            } else {\n");
      out.write("                $(this).addClass('icon-5');\n");
      out.write("                $(\"input[name='password']\").attr('type', 'text');\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.icon-nocheck').on('click', function () {\n");
      out.write("            if ($(this).hasClass('icon-check')) {\n");
      out.write("                $(this).removeClass('icon-check');\n");
      out.write("            } else {\n");
      out.write("                $(this).addClass('icon-check');\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // 进行登录操作\n");
      out.write("        form.on('submit(login)', function (data) {\n");
      out.write("            data = data.field;\n");
      out.write("            if (data.username == '') {\n");
      out.write("                layer.msg('用户名不能为空');\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if (data.password == '') {\n");
      out.write("                layer.msg('密码不能为空');\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if (data.captcha == '') {\n");
      out.write("                layer.msg('验证码不能为空');\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // 发送ajax请求\n");
      out.write("            $.ajax({\n");
      out.write("                url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/login',\n");
      out.write("                data: data,\n");
      out.write("                type: 'post',\n");
      out.write("                dataType: 'json',\n");
      out.write("\n");
      out.write("                success: function (result) {\n");
      out.write("                    if (200 == result.code)\n");
      out.write("                        location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/page/index.html'\n");
      out.write("                    else\n");
      out.write("                        layer.msg(result.msg, {icon:2})\n");
      out.write("                }\n");
      out.write("            })\n");
      out.write("\n");
      out.write("            return false;\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
