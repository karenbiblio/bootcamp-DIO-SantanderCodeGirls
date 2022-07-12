public class TreinandoVariaveis {

    //Exemplos da aula de Variáveis, Tipos de Dados e Operadores Mat em Java

    public static void main(String[] args) {

    //Nome de variáveis

    int i;
    //int i; não pode ter nome repetido para variável
    int I; //case sensitives, é um nome diferente
    //int 1a; não pode começar com número
    int _1a; //não é uma boa prática
    int $aq; //não é uma boa prática

    //Atribuindo valores às variáveis (inicializando) para testar saída

    i = 15;
    I = 10;
    _1a = 20;
    $aq = 7;

    final int j = 10; //final é uma constante
    //j = 15; Não posso atribuir outro valor para o J, pois é uma final
    int asrn24678md; //funciona mas não é uma boa prática
    //int asrn246 78md; não pode ter espaço
    int asrn2$4678_md; //não é uma boa prática
    //int asrn2$46%78_md = 10; não pode usar caracteres especiais

    asrn24678md = 100;
    asrn2$4678_md = 10;

    int quantidadeProduto = 50; //camel case
    //int QuantidadeProduto; não segue a boa prática
    final int NUMERO_TENTATIVAS = 5; //essa é a regra de nome para final
    //final int numeroTentativas = 5; não é uma boa prática
    int QUANTIDADE_OPCOES = 25; //não da erro mas não é boa prática, isso é pra final
    //int qtdProd; não é uma boa prática por conta da falta de expressividade

    System.out.println("");
    System.out.println("PARTE 1 do Curso - NOME DAS VARIÁVEIS");
    System.out.println(".........Exibindo Atribuições........");
    System.out.println("");

        System.out.println("i = " + i);
        System.out.println("I = " + I);
        System.out.println("_1a = " + _1a);
        System.out.println("$aq = " + $aq);

        System.out.println("j = " + j);
        System.out.println("asrn24678md = " + asrn24678md);
        System.out.println("asrn2$4678_md = " + asrn2$4678_md);

        System.out.println("quantidadeProduto = " + quantidadeProduto);
        System.out.println("NUMERO_TENTATIVAS = " + NUMERO_TENTATIVAS);
        System.out.println("QUANTIDADE_OPCOES = " + QUANTIDADE_OPCOES);

    System.out.println("");
    System.out.println("FIM DA AULA 1");
    System.out.println("");

    }

}
