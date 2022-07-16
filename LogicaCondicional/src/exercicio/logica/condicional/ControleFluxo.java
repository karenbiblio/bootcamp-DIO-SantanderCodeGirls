package exercicio.logica.condicional;

public class ControleFluxo {

    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }

    private static void ifFlecha() {

        int mes = 3;

        //Esse é um exemplo do "if flecha" que não é uma boa prática

        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                System.out.println("Mês não aceito ou indefinido.");
                            }
                        }
                    }
                }
            }
        }

    }

    private static void ifSemFlecha() {

        int mes = 2;

        //Essa é uma modalidade de if melhor escrita

        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else {
            System.out.println("Mês não aceito ou número inválido.");
        }

    }

    private static void ifFerias() {

        //Aqui não se deve usar um if, no caso seria melhor um Switch, exemplo abaixo

        String mes = "Julho";
        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
            System.out.println("Férias");
        }

    }

    private static void ifMenor() {

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantDependentes = 4;
        int mediaDependentes = 2;

        //Três maneiras de escrever um código para um mesmo objetivo, sendo que a última é um if menor

        if ((salarioMensal < mediaSalario) && (quantDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio.");

        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber o auxílio.");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Fncionário deve receber auxilio.");
        } else {
            System.out.println("Funcionário não deve receber auxílio.");
        }
    }

    private static void switchSemana() {

        String dia = "Quarta";

        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println(0);
                break;
        }

        }

    private static void switchNumero() {

        //exemplo de switch com int e com o break depois de mais de uma opção de escolha

        int numero = 4;

        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Número Certo!");
                break;
            case 4:
                System.out.println("Número aceitável!");
                break;
            case 5:
            case 6:
                System.out.println("Número Errado.");
                break;
            default:
                System.out.println("Número não válido.");
                break;

        }

    }

    private static void switchFerias() {

        //exemplo de switch com string e também resolvendo o problema do exemplo Ferias com if

        String mes = "dezembro";

        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias!");
                break;
            default:
                System.out.println("Mês indefinido.");
                break;

        }

    }

}


