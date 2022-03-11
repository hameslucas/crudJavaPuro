/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author silvio.junior
 */
public class UsuarioDaoImplTeste {

    List<Usuario> usuarios = new ArrayList<>();

    public UsuarioDaoImplTeste() {
        gerarListaUsuario();
    }       
    
    public void gerarListaUsuario(){
        Usuario usuario;
        for (int i = 0; i < 5; i++) {
            usuario = new Usuario(gerador.GeradorUtil.gerarNome(), 
                    gerador.GeradorUtil.gerarLogin(), 
                    gerador.GeradorUtil.gerarSenha(5));
            usuarios.add(usuario);
        }
        
        System.out.println("Login: " + usuarios.get(0).getLogin());        
        System.out.println("Senha: " + usuarios.get(0).getSenha());        
    }
    
    public Usuario verificarLogin(String login, String senha){
        Usuario usu = null;
        for (Usuario usuario : usuarios) {
            if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)){
                usu = usuario;
                break;
            }
        }        
        return usu;
    }
}










