/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.control;

/**
 *
 * @author Daniel
 */
public class Testador {
    
    public static boolean validarCodigo(String codigo) {
        if (codigo.isEmpty()) {
            return false;
        }
        if (!codigo.matches("[0-9]+")) {
            return false;
        }

        return true;
    }
    
    public static boolean validarData(String data) {
        if (data.isEmpty()) {
            return false;
        }
        if (!data.matches("[0-9]+")) {
            return false;
        }

        return true;
    }
    
    public static boolean validarQuantidade(String quantidade) {
        if (quantidade.isEmpty()) {
            return false;
        }
        if (!quantidade.matches("[0-9]+")) {
            return false;
        }

        return true;
    }
    
    public static boolean validarValor(String valor) {
        if (valor.isEmpty()) {
            return false;
        }
        if (!valor.matches("[0-9-.]+")) {
            return false;
        }

        return true;
    }
    
    public static boolean validarUsuario(String usuario) {
        if (usuario.isEmpty()) {
            return false;
        }
        if (!usuario.matches("[A-Za-z@._]+")) {
            return false;
        }

        return true;
    }
    
    public static boolean validarSenha(String senha) {
        if (senha.isEmpty()) {
            return false;
        }
        if (!senha.matches("[A-Za-z@._]+")) {
            return false;
        }

        return true;
    }
    
    public static boolean validarProduto(String produto) {
        if (produto.isEmpty()) {
            return false;
        }
        if (!produto.matches("[A-Za-z@._]+")) {
            return false;
        }

        return true;
    }

    /*private static boolean validarRg(String rg) {
        if (rg.isEmpty()) {
            return false;
        }
        if (!rg.matches("[A-Za-z0-9]+")) {
            return false;
        }

        return true;
    }

    private static boolean validarCpf(String cpf) {
        if (cpf.isEmpty()) {
            return false;
        }
        if (!cpf.matches("[0-9]+")) {
            return false;
        }

        return true;
    }

    private static boolean validarIdade(String idade) {
        if (idade.isEmpty()) {
            return false;
        }
        if (!idade.matches("[0-9]+")) {
            return false;
        }
        return true;
    }

    private static boolean validarEmail(String email) {
        if (email.isEmpty()) {
            return false;
        }
        if (!email.matches("[A-Za-z@._]+")) {
            return false;
        }
        return true;
    }

    private static boolean validarTelefone(String telefone) {
        if (telefone.isEmpty()) {
            return false;
        }
        if (!telefone.matches("[0-9]+")) {
            return false;
        }
        return true;
    }

    static boolean validarCadastro(String nome, String rg, String cpf,
            String idade, String email, String telefone) {

        if (!validarNome(nome)
                || !validarRg(rg)
                || !validarCpf(cpf)
                || !validarIdade(idade)
                || !validarEmail(email)
                || !validarTelefone(telefone)) {
            return false;
        }

        return true;
    }*/
    
}
