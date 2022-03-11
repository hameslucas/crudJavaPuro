/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lucas.santos23
 */
public class ConexaoBanco {
    
    public static Connection abrirConexao() throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    return DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/senac?useTimezone=true&serverTimezone=America/Sao_Paulo&zeroDateTimeBehavior=convertToNull",
    "root", "Senac2021");
    }
        }

