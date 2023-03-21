// Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
// Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
// Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String args[]) {
        int valor_saque, nota100, nota50, nota10, nota5, nota1, sobra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco Central do Brasil");
        System.out.print("Insira o valor que deseja sacar: ");
        valor_saque = scanner.nextInt();
        if (valor_saque < 10) {
        } else if (valor_saque > 600) {
            System.out.println("Erro! valor maximo para sacar eh de R$600,00");
        } else {
            nota100 = (valor_saque / 100);
            sobra = (valor_saque - nota100 * 100);
            nota50 =  sobra / 50;
            sobra = sobra - (nota50* 50);
            nota10 = sobra / 10;
            sobra = sobra - (nota10 * 10);
            nota5 = sobra / 5;
            sobra = sobra - (nota5 * 5);
            nota1 = sobra;
            System.out.println("Para sacar R$"+valor_saque);
            System.out.println(nota100+" notas de R$100 reais");
            System.out.println(nota50+ " notas de R$50 reais");
            System.out.println(nota10+" notas de R$10 reais");
            System.out.println(nota5+" notas de R$5 reais");
            System.out.println(nota1+" notas de R$1 real");
        }
    }
}