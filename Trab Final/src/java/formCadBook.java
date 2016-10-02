/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import classesJava.LivroDAO;
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
public class formCadBook extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    LivroDAO livroDao = new LivroDAO();
	
    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
       String titulo = request.getParameter("titulo");
       String editora = request.getParameter("editora");
       String autor = request.getParameter("autor");
       String categoria = request.getParameter("categoria");
       int ano = Integer.parseInt((String)request.getParameter("ano"));
       String edicao = request.getParameter("edicao");
       int paginas = Integer.parseInt((String)request.getParameter("paginas"));
       String codBarras = request.getParameter("codBarras");
       String isbn = request.getParameter("isbn");
       String idioma = request.getParameter("idioma");
       String estoque = request.getParameter("estoque");
       
       livroDao.criaLivro(titulo, editora, autor, categoria, ano, edicao, paginas, codBarras, isbn, idioma, estoque);
       
       response.sendRedirect("pages/cadBook.jsp");
       
    }

}
