// Joao faz aniversario dia 18 do mes de março, Olivia 06 de março 
// Cascão faz no dia 23 de março
// Faça um programa que parabenize as crianças quando for o dia do seu aniversario.
import java.util.Calendar;

public class Main {
  public static void main(String args[]) {
    int mes, dia;
    Calendar data = Calendar.getInstance();
    mes = 3; // 23/03/2023
    dia = data.get(Calendar.DAY_OF_MONTH);
    // Esta printando 2, sendo que estamos no mes 3 nao entendi System.out.println(data.get(Calendar.MONTH)); 
    
    if (mes == 3) {
        switch (dia){
            case 6:
                System.out.println("Feliz aniversario Olivia!");
                break;
            case 18:
                System.out.println("Feliz aniversario Joao!");
                break;
            case 23:
                System.out.println("Feliz aniversario Cascao!");
                break;
      }
    }
  }
}