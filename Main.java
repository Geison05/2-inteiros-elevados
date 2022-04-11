import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Variavel
    int numero1 = 0,
        numero2 = 0;
   double saida = 0.0,
          saida2 =0.0;
  //Entrada 
  System.out.print("\nPrimeiro numero inteiro : ");
  numero1 = input.nextInt();
  System.out.print("\nSegundo numero inteiro : ");
  numero2 = input.nextInt();
  //Processamento
  saida = Math.pow(numero1, numero2);
  saida2 = Math.pow(numero2, numero1);
  //saida
  System.out.println("\nPrimeiro numero elevado ao Segundo : " + saida);
  System.out.println("\nSegundo numero elavdo ao Primeiro : " + saida2);    
  }
}