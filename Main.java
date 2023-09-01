import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner leitor = instanciar_scanner();
    int teste;
    teste = ler_inteiro(leitor);
    System.out.printf("teste: %d", teste);
    desinstanciar_scanner(leitor);
  }

  public static Scanner instanciar_scanner() {
    Scanner retorno = new Scanner(System.in);
    return retorno;
  }

  public static void desinstanciar_scanner(Scanner scanner) {
    scanner.close();  
  }

  public static void limpar_buffer_do_scanner(Scanner scanner) {
    scanner.nextLine();
  }
  
  public static int ler_inteiro(Scanner scanner) {
    int retorno = 0;
    retorno = scanner.nextInt();
    return retorno;
  }
}