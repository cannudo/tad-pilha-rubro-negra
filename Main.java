import java.util.Scanner;

class Main {
  
  public interface Pilha {
    public int size();
    public boolean isEmpty();
    public object top() throws PilhaVaziaException;
    public void push(Object o);
    public Object pop() throws PilhaVaziaException;
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

  public static int[] declarar_vetor(int tamanho) {
    int[] vetor = new int[tamanho];
    return vetor;
  }

  public static void main(String[] args) {
    Scanner leitor = instanciar_scanner();
    int tamanho;
    tamanho = ler_inteiro(leitor);
    int[] vetor = declarar_vetor(tamanho);
  }
}