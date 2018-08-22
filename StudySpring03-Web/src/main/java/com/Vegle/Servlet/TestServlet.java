package com.Vegle.Servlet;


import com.Vegle.Beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        ApplicationContext ctx = (ApplicationContext) this.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        User user = (User) ctx.getBean("user");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {

    }
}
