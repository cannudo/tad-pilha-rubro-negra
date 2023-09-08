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

    public static int imprimir_menu(Scanner leitor) {
        System.out.println("1 - Inserir");
        System.out.println("2 - Remover");
        System.out.println("3 - Imprimir");
        System.out.println("99 - Sair");

        int opcao = ler_inteiro(leitor);
        return opcao;
    }

    public static void main(String[] args) {
        Scanner leitor = instanciar_scanner();
        int capacidade = ler_inteiro(leitor);
        PilhaRubroNegra pilha_rubro_negra = new PilhaRubroNegra(1);
        System.out.println("Capacidade da pilha: " + pilha_rubro_negra.getCapacidade());
        System.out.println("Indice do topo: " + pilha_rubro_negra.getIndice_do_topo()); // -1
        System.out.println("Pilha vazia? " + pilha_rubro_negra.isEmpty()); // true
        pilha_rubro_negra.push(1); // [ 1 ]
        pilha_rubro_negra.listar_elementos(); // [ 1 ]
        System.out.println("Indice do topo: " + pilha_rubro_negra.getIndice_do_topo()); // 0
        System.out.println("Pilha vazia? " + pilha_rubro_negra.isEmpty()); // false
        pilha_rubro_negra.push(2); // capacidade = 2 e [ 1, 2 ]
        System.out.println("Capacidade da pilha: " + pilha_rubro_negra.getCapacidade());
        pilha_rubro_negra.listar_elementos(); // [ 1, 2 ]
        pilha_rubro_negra.push(3); // capacidade = 4 e [ 1, 2, 3 ]
        System.out.println("Capacidade da pilha: " + pilha_rubro_negra.getCapacidade());
        pilha_rubro_negra.listar_elementos(); // [ 1, 2, 3 ]
        pilha_rubro_negra.push(4); // [ 1, 2, 3, 4 ]
        pilha_rubro_negra.listar_elementos(); // [ 1, 2, 3, 4 ]
        pilha_rubro_negra.push(5); // capacidade = 8 e [ 1, 2, 3, 4, 5 ]
        System.out.println("Capacidade da pilha: " + pilha_rubro_negra.getCapacidade());

        desinstanciar_scanner(leitor);
    }
}