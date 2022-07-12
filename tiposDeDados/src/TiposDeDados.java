public class TiposDeDados {

    //Exemplos da aula de Variáveis, Tipos de Dados e Operadores Mat em Java

    public static void main(String[] args) {

        //Tipos de Dados - 2 exemplos para cada tipo

        //Tipos de números inteiros

        byte b1 = 10; //números pequenos
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; aqui o tamanho ultrapassou

        //int i1 = -10000000000; aqui também ultrapassou o limite inferior
        int i2 = 28500;

        long l1 = 1000000000000000000L; //números grandes
        long l2 = 2004005000500055000L;

        //Tipos de números fracionários

        //float f1 = 4.5; tem que por f na frente ou java confunde com double
        float f2 = 10.68f;

        double d1 = 85.69; //tanto faz colocar o d na frente ou não
        double d2 = 99.84d;

        //Tipos textuais

        char c1 = 'W';
        //char 'Tw'; erro porque aqui só cabe um caracter
        char c3 = '\u0057'; //esse código representa 1 caracter, unicode para W

        String st1 = "Fulano";
        // String não é tipo primitivo, é composto, classe em Java, mas mto usado
        String st2 = "Cicrano";
        String st3 = "letras e 12345";
        //String dt1 = "'02/02/2022"; aqui é usado como um texto mas tem o tipo data

        //Tipo lógico

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println("");
        System.out.println("PARTE 2 do Curso - TIPOS DE DADOS");
        System.out.println(".......Exibindo Atribuições......");
        System.out.println("");

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("s1 = " + s1);
        System.out.println("i2 = " + i2);
        System.out.println("b1 = " + b1);
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println("f2 = " + f2);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("c1 = " + c1);
        System.out.println("c3 = " + c3);
        System.out.println("st1 = " + st1);
        System.out.println("st2 = " + st2);
        System.out.println("st3 = " + st3);
        System.out.println("bo1 = " + bo1);
        System.out.println("bo2 = " + bo2);

        System.out.println("");
        System.out.println("FIM DA AULA 2");
        System.out.println("");


    }

}
