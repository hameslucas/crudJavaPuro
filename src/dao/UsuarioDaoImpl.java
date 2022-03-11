/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author lucas.santos23
 */
public class UsuarioDaoImpl {
    
    private Connection conexao;
    private PreparedStatement  preparaInstrucao;
    
    public void salvar(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuario (nome, login, senha) VALUES (?, ?, ?)";
        try {
            conexao = ConexaoBanco.abrirConexao();
            preparaInstrucao = conexao.prepareStatement(sql);
            preparaInstrucao.setString(1, usuario.getNome());
            preparaInstrucao.setString(2, usuario.getLogin());
            preparaInstrucao.setString(3, usuario.getSenha());            
            preparaInstrucao.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao salvar usuário " + e.getMessage());
        }finally{
            conexao.close();
            preparaInstrucao.close();
        }
    }
    
    public Usuario verificarLogin(String login, String senha) {
        return null;
    }
    
}
