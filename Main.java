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

  public static void inserir_elementos(int tamanho, int[] vetor, Scanner scanner) {
    for(int i = 0; i < tamanho; i++) {
      System.out.printf("%d: ", i);
      vetor[i] = ler_inteiro(scanner);
    }
  }

  public static void imprimir_elementos(int tamanho, int[] vetor, Scanner scanner) {
    for(int i = 0; i < tamanho; i++) {
      System.out.printf("%d: %d ", i, vetor[i]);
    }
  }

  public static void main(String[] args) {
    Scanner leitor = instanciar_scanner();
    int tamanho;
    tamanho = ler_inteiro(leitor);
    int[] vetor = declarar_vetor(tamanho);
    inserir_elementos(tamanho, vetor, leitor);
    imprimir_elementos(tamanho, vetor, leitor);
  }
}