<%-- 
    Document   : home
    Created on : 03/07/2016, 21:14:06
    Author     : ITALO-PC
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="classesJava.Livro"%>
<%@page import="classesJava.LivroDAO"%>
<%@page import="classesJava.Categoria"%>
<%@page import="classesJava.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp" %>


        <div id="main" class="container-fluid">
		<h3>Livros em Estoque</h3>
	</div>
	
	<%
		LivroDAO livroDAO = new LivroDAO();
		List<Livro> livros = livroDAO.getLivro();
		
		Iterator<Livro> iLivro = livros.iterator();
		while(iLivro.hasNext()){
			Livro livroIterator = (Livro) iLivro.next();
	%>
        <!--<div class="row" style="display: inline-block">
            <div class="form-group col-md-12">
            <ul>
                <li>
                    
                    <p>
                    Titulo: <%=livroIterator.getTitulo()%> <br>
                    Editora: <%=livroIterator.getEditora()%> <br>
                    Autor: <%=livroIterator.getAutor()%> <br>
                    Categoria: <%=livroIterator.getCategoria()%> <br>
                    Ano: <%=livroIterator.getAno()%> <br>
                    Edição: <%=livroIterator.getEdicao()%> <br>
                    Páginas: <%=livroIterator.getPaginas()%> <br>
                    Código de Barras: <%=livroIterator.getCodBarras()%> <br>
                    ISBN: <%=livroIterator.getIsbn()%> <br>
                    Idioma: <%=livroIterator.getIdioma()%> <br>
                    Estoque: <%=livroIterator.getEstoque()%> <br>
                    <a href="../LivroDAO<%//deleteLivro();%>" id="icon1"><i class="fa fa-trash-o fa-2x"></i></a>
                    </p>
                </li>  
            </ul>
            </div>
        </div>-->
        <div class="row" id="teste">
                <p id="titul"><span>Titulo:</span> <%=livroIterator.getTitulo()%></p>
                <a href="#" id="icon1"><i class="fa fa-trash-o fa-2x"></i></a>
                <a href="javascript:window.print()" id="icon2"><i class="fa fa-print fa-2x"></i></a>
                <hr>
                <img src="http://www.extra-imagens.com.br/livros/LivrodeLiteraturaEstrangeira/SuspensedeTerror/3477459/48556750/Livro-It-a-Coisa-Stephen-King-3477459.jpg" alt="">
                <p>
                    <span>Editora:</span> <%=livroIterator.getEditora()%> 
                    <span>Autor:</span> <%=livroIterator.getAutor()%> <br>
                    <span>Categoria:</span> <%=livroIterator.getCategoria()%> <br>
                    <span>Ano:</span> <%=livroIterator.getAno()%> 
                    <span>Edição:</span> <%=livroIterator.getEdicao()%> <br>
                    <span>Páginas:</span> <%=livroIterator.getPaginas()%>
                    <span>Idioma:</span> <%=livroIterator.getIdioma()%> 
                    <span>Cód. de Barras:</span> <%=livroIterator.getCodBarras()%> <br>
                    <span>ISBN:</span> <%=livroIterator.getIsbn()%> 
                    <span>Estoque:</span> <%=livroIterator.getEstoque()%>
                </p>
        </div>
	<%
		}
	%>
        
        
        



<%@include file="footer.jsp" %>
