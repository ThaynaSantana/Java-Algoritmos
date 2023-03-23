/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */
import java.util.Scanner;
public class IdadeDias {
  public static void main(String args[]){
    int idade, anos, meses, dias;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Insira sua idade em anos: ");
    anos = scanner.nextInt();
    System.out.print("E quantos meses: ");
    meses = scanner.nextInt();
    System.out.print("E quantos dias: ");
    dias = scanner.nextInt();
    idade = (anos* 365) + (meses*30) + dias;
    System.out.println(anos+" anos, "+meses+" meses, "+dias+" dias = " +idade+" dias.");
  }
}