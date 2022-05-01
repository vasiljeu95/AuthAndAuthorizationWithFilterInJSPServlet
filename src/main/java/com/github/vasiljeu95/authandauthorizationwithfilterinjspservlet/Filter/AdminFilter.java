package com.github.vasiljeu95.authandauthorizationwithfilterinjspservlet.Filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.HttpRetryException;

@WebFilter(filterName = "AdminFilter")
public class AdminFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession httpSession = httpServletRequest.getSession();

        if (httpSession.getAttribute("username") == null && !httpServletRequest.getRequestURI().endsWith("admin/account"))
            httpServletRequest.getRequestDispatcher("login.jsp").forward(request, response);
        else
            chain.doFilter(request, response);
    }
}
