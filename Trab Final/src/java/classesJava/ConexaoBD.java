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
import java.sql.*;

public class ConexaoBD {
	public Connection getConexao() {
		Connection conexao = null;
		String usuario = "postgres";
		String senha = "87531399";
		String nomeBancoDados = "ArmazenaLivros";
 
		try {
			Class.forName("org.postgresql.Driver");
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + nomeBancoDados,
					 usuario, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}
}
