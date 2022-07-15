package exercicio.retornos;

public class Main {

    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercício usando o return");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(4d, 6d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);

        float areaLosango = Quadrilatero.area(3f, 6f);
        System.out.println("Área do losango: " + areaLosango);

    }

}
