/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ITALO-PC
 */
public class ServletLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Cookie[] cookies = request.getCookies();
        String logon = "";
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equalsIgnoreCase("minhaLib.login")) {
                    logon = c.getValue();
                    break;
                }
            }
        }
        
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        if(login != null && senha != null && login.equals(senha)){
            HttpSession session = request.getSession(true);
            session.setAttribute("login",login);
            
            Cookie c = new Cookie("minhaLib.login", login);
            c.setMaxAge(120);
            response.addCookie(c);
            
            response.sendRedirect("pages/home.jsp");
        }else{
            response.sendRedirect("index.html");
        }
    }
}
