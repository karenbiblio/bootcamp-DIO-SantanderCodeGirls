package exercicio.metodos.java;

public class Calculadora {

    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);

    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A subtração entre " + numero1 + " e " + numero2 + " é igual a " + resultado);

    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " e " + numero2 + " é " + resultado);

    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("A divisão entre " + numero1 + " e " + numero2 + " é " + resultado);

    }
}
