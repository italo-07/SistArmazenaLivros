/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesJava;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITALO-PC
 */
public class CategoriaDAO {
    
    public int criaCategoria(String categoria, String descricao) {

        try {

            Connection connection = new ConexaoBD().getConexao();
            PreparedStatement ps = null;

            String sql = "INSERT INTO categoria (categoria, descricao)"
                    + " VALUES (?,?)";

            ps = connection.prepareStatement(sql);
            ps.setString(1, categoria);
            ps.setString(2, descricao);
            ps.executeUpdate();
            ps.close();
            return 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Categoria> getCategoria() {
        try {
            Connection connection = new ConexaoBD().getConexao();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM categoria";
            ResultSet resultSet = statement.executeQuery(sql);

            List<Categoria> listaCategoria = new ArrayList<Categoria>();

            while (resultSet.next()) {
                Categoria categoria = new Categoria();
                categoria.setCategoria(resultSet.getString("categoria"));
                categoria.setDescricao(resultSet.getString("descricao"));
                listaCategoria.add(categoria);
            }

            resultSet.close();
            statement.close();
            connection.close();
            return listaCategoria;

        } catch (SQLException ex) {
            System.out.println("Erro no SQL: " + ex);
            return null;
        }
    }
}
