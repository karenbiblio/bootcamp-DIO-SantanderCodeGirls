package exercicio.metodos.java;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //Chamando os métodos da classe Calculadora

        System.out.println("************************");
        System.out.println("Exercício de Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Chamando os métodos da Classe Mensagem

        System.out.println("***********************");
        System.out.println("Exercício das Mensagens");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);

        //Chamando os métodos da Classe Emprestimo

        System.out.println("********************");
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }

}
