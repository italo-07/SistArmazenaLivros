<%-- 
    Document   : cadBook
    Created on : 03/07/2016, 19:57:11
    Author     : ITALO-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp" %>
    
        <div id="main" class="container-fluid">

            <div class="row">
              <div class="form-group col-md-3"></div>
              <div class="form-group col-md-3">
                <h3>Cadastrar Livro</h3>
              </div>
              <div class="form-group col-md-3"></div>
              <div class="form-group col-md-3"></div>
            </div>  
  
  
            <form action="../formCadBook" method="post">
                  <div class="row">
                    <div class="form-group col-md-3"></div>
                    <div class="form-group col-md-2">
                        <label>Titulo</label>
                        <input type="text" class="form-control" name="titulo" placeholder="Digite o titulo do livro">
                    </div>
                    <div class="form-group col-md-2">
                        <label>Editora</label>
                        <input type="text" class="form-control" name="editora" placeholder="Digite a Editora do Livro">
                    </div>
                    <div class="form-group col-md-2">
                        <label>Autor</label>
                        <input type="text" class="form-control" name="autor" placeholder="Digite o nome do autor">
                    </div>
                    <div class="form-group col-md-3"></div>
                  </div>

                  <div class="row">
                    <div class="form-group col-md-3"></div>
                    <div class="form-group col-md-2">
                        <label>Categoria</label>
                        <input type="text" class="form-control" name="categoria" placeholder="Digite o tema do livro">
                    </div>
                    <div class="form-group col-md-2">
                        <label>Ano</label>
                        <input type="text" class="form-control" name="ano" placeholder="Digite o ano de lançamento">
                    </div>
                    <div class="form-group col-md-2">
                        <label>Edição</label>
                        <input type="text" class="form-control" name="edicao" placeholder="Digite a edição do livro">
                    </div>
                    <div class="form-group col-md-3"></div>
                  </div>

                  <div class="row">
                    <div class="form-group col-md-3"></div>
                    <div class="form-group col-md-2">
                        <label>Numero de Páginas</label>
                        <input type="text" class="form-control" name="paginas" placeholder="Digite o numero de páginas">
                    </div>
                    <div class="form-group col-md-2">
                        <label>Código de Barras</label>
                        <input type="text" class="form-control" name="codBarras" placeholder="Digite o codigo do Livro">
                    </div>
                    <div class="form-group col-md-2">
                        <label>ISBN</label>
                        <input type="text" class="form-control" name="isbn" placeholder="Digite o ISBN do Livro">
                    </div>
                  <div class="form-group col-md-3"></div>
                  </div>

              <div class="row">
                  <div class="form-group col-md-3"></div>
                  <div class="form-group col-md-3">
                    <label>Idioma</label>
                    <input type="text" class="form-control" name="idioma" placeholder="Digite o idioma do livro">
                  </div>
                  <div class="form-group col-md-3">
                    <label>Quantidade no Estoque</label>
                    <input type="text" class="form-control" name="estoque" placeholder="Digite a quantidade de livros">
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
        
<%@include file="footer.jsp" %>       
