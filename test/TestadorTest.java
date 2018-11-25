/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.inatel.projeto.control.Testador;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Daniel
 */
public class TestadorTest {
    
    public TestadorTest() {
    }
    
    private String codigo;
    private String data;
    private String quantidade;
    private String valor;
    private String usuario;
    private String senha;
    private String produto;
    
    @Before
    public void setup() {
        codigo = "1155";
        data = "01012018";
        quantidade = "111";
        valor = "32.50";
        usuario = "danielsouza";
        senha = "senha1234";
        produto = "Meia velha";
    }
    
    @Test
    public void codigoCorreto() {
        codigo = "0123";
        boolean t = Testador.validarCodigo(codigo);
        assertTrue(t);
    }
    
    @Test
    public void codigoComLetra() {
        codigo = "012a";
        boolean t = Testador.validarCodigo(codigo);
        assertFalse(t);
    }
    
    @Test
    public void dataCorreto() {
        codigo = "01012018";
        boolean t = Testador.validarData(data);
        assertTrue(t);
    }
    
    @Test
    public void dataComLetra() {
        data = "0101201a";
        boolean t = Testador.validarData(data);
        assertFalse(t);
    }
    
    @Test
    public void quantidadeCorreta() {
        codigo = "123";
        boolean t = Testador.validarCodigo(quantidade);
        assertTrue(t);
    }
    
    @Test
    public void quantidadeComLetra() {
        quantidade = "32a";
        boolean t = Testador.validarQuantidade(quantidade);
        assertFalse(t);
    }
    
    @Test
    public void valorCorreto() {
        valor = "31.50";
        boolean t = Testador.validarValor(valor);
        assertTrue(t);
    }
    
    @Test
    public void valorComLetra() {
        valor = "32.a2";
        boolean t = Testador.validarValor(valor);
        assertFalse(t);
    }
    
    @Test
    public void usuarioComCaractereEspecial() {
        usuario = "danie#l";
        boolean t = Testador.validarUsuario(usuario);
        assertFalse(t);
    }
    
    @Test
    public void senhaComCaractereEspecial() {
        senha = "danie#l";
        boolean t = Testador.validarSenha(senha);
        assertFalse(t);
    }
    
    @Test
    public void produtoComCaractereEspecial() {
        produto = "danie#l";
        boolean t = Testador.validarProduto(produto);
        assertFalse(t);
    }
    
}
