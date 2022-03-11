/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Usuario;
import gerador.GeradorUtil;
import static gerador.GeradorUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas.santos23
 */
public class UsuarioDaoImplTest {
    
    private Usuario usuario;
    private UsuarioDaoImpl usuarioDaoImpl;
    
    public UsuarioDaoImplTest() {
        usuarioDaoImpl = new UsuarioDaoImpl();
    }

    /**
     * Test of salvar method, of class UsuarioDaoImpl.
     * @throws java.lang.Exception
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        usuario = new Usuario(gerarNome(),gerarLogin(),gerarSenha(5));
        usuarioDaoImpl.salvar(usuario);
        
    }

    /**
     * Test of verificarLogin method, of class UsuarioDaoImpl.
     */
 //   @Test
    public void testVerificarLogin() {
        System.out.println("verificarLogin");
    }
    
}
