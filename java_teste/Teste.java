package java_teste;

import java.util.Scanner;

/**
 * Teste
 */
public class Teste {

    public static void main(String[] args) {
        String senhaCadastrada = "1234";
        
        System.out.println("Programa em execução...\n");

        Scanner t = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = t.next();

        System.out.println("Digite sua senha: ");
        String senha = t.next();

        if(senha.equalsIgnoreCase(senhaCadastrada)){
            System.out.println("Seja bem vindo, "+nome);

        }else{
            System.out.println("Senha incorreta!");
        }
    }
}
