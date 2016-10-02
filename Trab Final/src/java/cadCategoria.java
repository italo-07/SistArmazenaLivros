/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import classesJava.CategoriaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ITALO-PC
 */
public class cadCategoria extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    CategoriaDAO categoriaDao = new CategoriaDAO();
    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        /*HttpSession session = request.getSession();
        
        if(session.getAttribute("login") == null){
            response.sendRedirect("index.html");
        }else{
            request.getRequestDispatcher("WEB-INF/pages/cadCategory.jsp").forward(request, response);
        }*/
        String categoria = request.getParameter("categoria");
        String descricao = request.getParameter("descricao");

        categoriaDao.criaCategoria(categoria, descricao);

        response.sendRedirect("pages/cadCategory.jsp");
        
    }

}
