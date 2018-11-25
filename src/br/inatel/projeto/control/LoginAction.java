/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.control;

import br.inatel.projeto.model.MySqlConnect;
import br.inatel.projeto.view.ControleFrame;
import br.inatel.projeto.view.ControleFrame_User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class LoginAction {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    
    public void RealizaLogin(String usuario, String senha)
    {
        
        boolean sucesso = false;
        // Abrir conexão com o BD
        conn = MySqlConnect.ConnectDB();
        String Sql = "SELECT * FROM system_user WHERE username=? and passord=?";
        try {
            // Preparar consulta
            pst = conn.prepareStatement(Sql);
            pst.setString(1, usuario);
            pst.setString(2, senha);
            // Executar a Query e retornar a tabela resultada da busca para RS
            rs = pst.executeQuery();
            // Enquanto houverem linhas na tabela, rs.next() anda de 1 em 1 linha
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bem-vindo!");
                if(rs.getInt(5) == 0) {
                    ControleFrame cf = new ControleFrame();
                    cf.setVisible(true);
                }
                
                else {
                    ControleFrame_User cfU = new ControleFrame_User();
                    cfU.setVisible(true);
                }
                
                //IS LOGGED-----------------------------------------------------
                String Sql1 =
                        "UPDATE system_user SET isLogged=1 WHERE username=?;";
                try {
                    pst = conn.prepareStatement(Sql1);
                    pst.setString(1, usuario);
                    pst.executeUpdate();
                } catch(Exception e) {
                    System.out.println("Erro: Conexão Banco! (isLogged)");
                }
                //END IS LOGGED-------------------------------------------------
                
                sucesso = true;
            }
           
        } catch (SQLException e) {
            System.out.println("Erro: Conexão Banco!");
            sucesso = false;
        } finally {
            // Fechar RS, PST e CONN
               try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Erro: Conexão não pode ser fechada!");
            }
        }
        // Se sucesso = false, mostrar essa mensagem para o usuario
         if (!sucesso) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválido(a)!", "Acesso Negado", JOptionPane.ERROR_MESSAGE);
         }
        
    }

    
}

