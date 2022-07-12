package treinandoOperadores;

//Exemplos da aula de Variáveis, Tipos de Dados e Operadores Mat em Java

public class TreinoOperadores {

    //Operadores Matemáticos em Java

    public static void main(String[] args){

        //métodos auxiliares só para deixar o código organizado

        System.out.println("prePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

    }

    private static void prePos(){

        int k = 10;

        int i = ++k; //pré fixado, onde primeiro soma para depois atribuir
        int j = k--; //pós fixado, onde primeiro atribui para depois subtrair
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);

    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b; //operação de soma
        int r2 = c-a; //operação de subtração
        int r3 = d*b; //operação de multiplicação
        int r4 = e/a; //operação de divisão
        int r5 = c%b; //operação que retorna o resto da divisão

        System.out.println("a+b = " + r1);
        System.out.println("c-a = " + r2);
        System.out.println("d*b = " + r3);
        System.out.println("e/a = " + r4);
        System.out.println("c%b = " + r5);

    }

    private static void atribuicao() {

        //Atribuições simples

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d: " + d);

        //Atribuições compostas

        i += 5; //significa i = i + 5
        j -=3; //significa j = j - 3
        d /= 2.7d; //significa d = d / 2.7d
        l *= 3; //significa l = l * 3
        k %= 2; //significa k = k % 2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j;

        System.out.println("k: " + k);
        System.out.println("i: " + i);

    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;
        // significa 10 + 19 * 30 = 10 + 570 = 580
        //ordem de execução: primeiro o pós fixado que só será modificado no final
        //o pré fixado já mudou
        //ou seja, ele vai fazer toda a conta e dar um resultado e só depois roda o i

        System.out.println("i++ + --j * k = " + a);
        System.out.println("i = " + i);

        int b = k / --i % 3 + 1;
        //significa 30 / 10 % 3 + 1 = 1
        // o pré fixado faz primeiro, depois a divisão e depois o resto

        System.out.println("k / --i % 3 + 1 = " + b);
        System.out.println("i = " + i);

        int c = 2;

        c *= i += 5;
        //significa c = 2 * i; i = i + 5; c = 2 * i; i = 10 + 5; c = 2 * 15; c = 30
        //Neste caso a precedência muda, no caso a atribuição composta prevaleceu

        System.out.println("c *= i += 5 = " + c);
        System.out.println("i = " + i);

        System.out.println("FIM DA AULA 3");

    }

}
