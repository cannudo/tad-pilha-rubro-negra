import java.util.Scanner;

class Main {
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

    public static void imprimir_menu() {
        System.out.println("1 - Inserir");
        System.out.println("2 - Remover");
        System.out.println("3 - Imprimir");
        System.out.println("99 - Sair");
    }

    public static void main(String[] args) {
        Scanner leitor = instanciar_scanner();
        int capacidade = ler_inteiro(leitor);
        PilhaRubroNegra pilha_rubro_negra = new PilhaRubroNegra(capacidade);
        System.out.println("Pilha criada. Sua capacidade é " + pilha_rubro_negra.getCapacidade() + " e tem " + (pilha_rubro_negra.getIndice_do_topo() + 1) + " elementos.");

        desinstanciar_scanner(leitor);
    }
}