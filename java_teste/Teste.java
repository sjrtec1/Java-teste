package java_teste;

import java.util.Scanner;

/**
 * Essa classe foi criada para realização de teste 
 * utilizando GitHub
 * 
 */
public class Teste {

    public static void main(String[] args) {
        String senhaCadastrada = "1234";
        String usuarioCadastrado = "silverio";

        System.out.println("Programa em execução...\n");

        Scanner t = new Scanner(System.in);

        System.out.println("digite seu usuário: ");
        String usuario = t.next();

        System.out.println("Digite sua senha: ");
        String senha = t.next();

        if(senha.equalsIgnoreCase(senhaCadastrada) && usuarioCadastrado.equalsIgnoreCase(usuario)){
            System.out.println("Seja bem vindo, "+nome);

        }else{
            System.out.println("Senha incorreta!");
        }
    }
}
