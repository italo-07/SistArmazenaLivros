<%-- 
    Document   : cadCategory
    Created on : 04/07/2016, 20:31:19
    Author     : ITALO-PC
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="classesJava.Categoria"%>
<%@page import="classesJava.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp" %>
    
        <div id="main" class="container-fluid">

            <div class="row">
              <div class="form-group col-md-3"></div>
              <div class="form-group col-md-3">
                <h3>Cadastrar Nova Categoria</h3>
              </div>
              <div class="form-group col-md-3"></div>
              <div class="form-group col-md-3"></div>
            </div>  
  
  
            <form action="../cadCategoria" method="post" id="">
                  <div class="row">
                    <div class="form-group col-md-3"></div>
                    <div class="form-group col-md-3">
                        <label>Categoria </label>
                        <input type="text" class="form-control" name="categoria" placeholder="Escolha a opção: ">
                    </div>
                    <div class="form-group col-md-3"></div>
                    <div class="form-group col-md-3"></div>
                  </div>

                  <div class="row">
                    <div class="form-group col-md-3"></div>
                    <div class="form-group col-md-6">
                        <label>Descrição:</label>
                        <input type="text" class="form-control" name="descricao" placeholder="Descreva a categoria">
                    </div>
                    <div class="form-group col-md-3"></div>
                  </div>
    
              <hr />

              <div class="row">
                    <div class="form-group col-md-3"></div>
                    <div class="col-md-3">
                        <button type="submit" class="btn btn-primary">Salvar</button>
                        <button type="button" class="btn btn-default">Cancelar</button>
                    </div>
                    <div class="form-group col-md-3"></div>
              </div>

            </form>
       </div>

       <div id="main" class="container-fluid">
		<h3>Categoria Livros</h3>
	</div>
	
	<%
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		List<Categoria> categoria = categoriaDAO.getCategoria();
		
		Iterator<Categoria> iCategoria = categoria.iterator();
		while(iCategoria.hasNext()){
			Categoria categoriaIterator = (Categoria) iCategoria.next();
	%>
        <!--<ul>
            <li>
                <p>
                Categoria: <%=categoriaIterator.getCategoria()%> 
                Descrição: <%=categoriaIterator.getDescricao()%> 
                </p>
            </li>
            
	</ul>-->
        <div class="row" id="cat">
            <i class="fa fa-book fa-5x" ></i>
            <p>
                <span>Categoria:</span> <%=categoriaIterator.getCategoria()%> <br>
                <span>Descrição:</span>  <%=categoriaIterator.getDescricao()%>  
            </p>
        </div>
	<%
		}
	%>
       
        
<%@include file="footer.jsp" %>
