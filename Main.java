import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner leitor = instanciar_scanner();
    int tamanho;
    tamanho = ler_inteiro(leitor);
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
    limpar_buffer_do_scanner(scanner);
    return retorno;
  }
}