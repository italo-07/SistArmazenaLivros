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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import classesJava.Livro;


public class LivroDAO {
	
	public int criaLivro(String titulo, String editora, String autor, String categoria, int ano, String edicao, int paginas, String codBarras, String isbn, String idioma, String estoque){
		
		try{

        	Connection connection = new ConexaoBD().getConexao();
        	PreparedStatement ps = null;
        	
			
        	        String sql = "INSERT INTO livro (titulo, editora, autor, categoria, ano, edicao, paginas, codBarras, isbn, idioma, estoque)"
                            + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        	
			ps = connection.prepareStatement(sql);
			ps.setString(1, titulo);
                        ps.setString(2, editora);
                        ps.setString(3, autor);
                        ps.setString(4, categoria);
                        ps.setInt(5, ano);
                        ps.setString(6, edicao);
                        ps.setInt(7, paginas);
                        ps.setString(8, codBarras);
                        ps.setString(9, isbn);
                        ps.setString(10, idioma);
                        ps.setString(11, estoque);
			ps.executeUpdate();
			ps.close();
            return 1;
            
		}catch(SQLException e){
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<Livro> getLivro(){
		try {
	    	Connection connection = new ConexaoBD().getConexao();
	        Statement statement = connection.createStatement();
	        String sql = "SELECT * FROM livro";
	        ResultSet resultSet = statement.executeQuery(sql);
	        
	        List<Livro> listaLivro = new ArrayList<Livro>();
	        
	        while (resultSet.next()) {
	        	Livro livro = new Livro();
	        	livro.setTitulo(resultSet.getString("titulo"));
                        livro.setEditora(resultSet.getString("editora"));
                        livro.setAutor(resultSet.getString("autor"));
                        livro.setCategoria(resultSet.getString("categoria"));
                        livro.setAno(resultSet.getInt("ano"));
                        livro.setEdicao(resultSet.getString("edicao"));
                        livro.setPaginas(resultSet.getInt("paginas"));
                        livro.setCodBarras(resultSet.getString("codBarras"));
                        livro.setIsbn(resultSet.getString("isbn"));
                        livro.setIdioma(resultSet.getString("idioma"));
                        livro.setEstoque(resultSet.getString("estoque"));
	        	listaLivro.add(livro);
	        }
	        
	        resultSet.close();
	        statement.close();
	        connection.close();
	        return listaLivro;
	        		
	    } catch (SQLException ex) {
	        System.out.println("Erro no SQL: "+ex);
	        return null;
	    }
	}
        
        public int deleteLivro(String titulo, String editora, String autor, String categoria, int ano, String edicao, int paginas, String codBarras, String isbn, String idioma, String estoque){
		
		try{

        	Connection connection = new ConexaoBD().getConexao();
        	PreparedStatement ps = null;
        	
			
        	        String sql = "DELETE FROM livro WHERE id=?";
        	
			ps = connection.prepareStatement(sql);
			ps.setString(1, titulo);
                        ps.setString(2, editora);
                        ps.setString(3, autor);
                        ps.setString(4, categoria);
                        ps.setInt(5, ano);
                        ps.setString(6, edicao);
                        ps.setInt(7, paginas);
                        ps.setString(8, codBarras);
                        ps.setString(9, isbn);
                        ps.setString(10, idioma);
                        ps.setString(11, estoque);
			ps.executeUpdate();
			ps.close();
            return 1;
            
		}catch(SQLException e){
			e.printStackTrace();
			return 0;
		}
	}
	
	

}

