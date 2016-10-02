package classesJava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITALO-PC
 */


public class Livro {
    
	private String titulo;
        private String editora;
        private String autor;
        private String categoria;
        private int ano;
        private String edicao;
        private int paginas;
        private String codBarras;
        private String isbn;
        private String idioma;
        private String estoque;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
        
        public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
        
        public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public String getEdicao() {
            return edicao;
        }

        public void setEdicao(String edicao) {
            this.edicao = edicao;
        }

        public int getPaginas() {
            return paginas;
        }

        public void setPaginas(int paginas) {
            this.paginas = paginas;
        }

        public String getCodBarras() {
            return codBarras;
        }

        public void setCodBarras(String codBarras) {
            this.codBarras = codBarras;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getIdioma() {
            return idioma;
        }

        public void setIdioma(String idioma) {
            this.idioma = idioma;
        }

        public String getEstoque() {
            return estoque;
        }

        public void setEstoque(String estoque) {
            this.estoque = estoque;
        }

}
