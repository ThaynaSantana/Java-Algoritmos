/*As organizações CSM resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes. by Thayna

a. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual;
b. Salários até R$ 280,00 (incluindo): aumento de 20%;
c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
e. Salários de R$ 1500,00 em diante: aumento de 5%
Após o aumento ser realizado; informe na tela;

a. O salário antes do reajuste;
b. O percentual de aumento aplicado;
c. O valor do aumento;
d. O novo salário, após o aumento. */

import java.util.Scanner;
public class SalarioColaborador {
    public static void main(String args[]) {
        double salario, aumento=0, novo_salario;
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Insira seu salario atual: ");
        salario = scanner.nextDouble();
        if (salario <= 280) {
            aumento = 0.2;
        } else if (280 < salario && salario < 700) {
            aumento = 0.15;
        } else if (700 < salario && salario < 1500) {
            aumento = 0.10;
        } else if (salario > 1500) {
            aumento = 0.05;
        }
        novo_salario = salario + (salario*aumento);
        System.out.println("Salario antes do aumento: R$"+salario);
        System.out.println("O percentual de aumento: %"+(aumento*100));
        System.out.println("O valor do aumento: R$"+(salario*aumento));
        System.out.println("O novo salario apos o aumento: R$"+novo_salario);
    }
}