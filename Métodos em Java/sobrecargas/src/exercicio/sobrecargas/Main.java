package exercicio.sobrecargas;

public class Main {

    public static void main(String[] args){

        // Chamando os métodos de sobrecargas dos Quadriláteros
        System.out.println("Exercício quadriláteros");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(3f,6f);

    }

}
