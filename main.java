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

    public static void testes_de_push() {
        PilhaRubroNegra pilha_rubro_negra = new PilhaRubroNegra(1);
        System.out.println("Capacidade da pilha: " + pilha_rubro_negra.getCapacidade()); // 1
        System.out.println("Indice do topo: " + pilha_rubro_negra.getIndice_do_topo()); // -1
        System.out.println("Pilha vazia? " + pilha_rubro_negra.isEmpty()); // true
        // System.out.println("Pilha vazia? " + pilha_rubro_negra.top()); // PilhaVaziaException
        pilha_rubro_negra.push(1); // empilhou 1
        pilha_rubro_negra.listar_elementos(); // [ 1 ]
        System.out.println("Indice do topo: " + pilha_rubro_negra.getIndice_do_topo()); // 0
        System.out.println("Pilha vazia? " + pilha_rubro_negra.isEmpty()); // false
        pilha_rubro_negra.push(2); // dobrou a capacidade de 1 para 2 e empilhou 2
        System.out.println("Capacidade da pilha: " + pilha_rubro_negra.getCapacidade()); // 2
        pilha_rubro_negra.listar_elementos(); // [ 1, 2 ]
        pilha_rubro_negra.push(3); // dobrou a capacidade de 2 para 4 e empilhou 3
        System.out.println("Capacidade da pilha: " + pilha_rubro_negra.getCapacidade()); // 4
        pilha_rubro_negra.listar_elementos(); // [ 1, 2, 3 ]
        pilha_rubro_negra.push(4); // dobrou a capacidade de 4 para 8 e empilhou 4
        pilha_rubro_negra.listar_elementos(); // [ 1, 2, 3, 4 ]
        pilha_rubro_negra.push(5); // [ 1, 2, 3, 4, 5 ]
        System.out.println("Capacidade da pilha: " + pilha_rubro_negra.getCapacidade());
        System.out.println("Indice do topo: " + pilha_rubro_negra.getIndice_do_topo()); // 4
        pilha_rubro_negra.listar_elementos(); // [ 1, 2, 3, 4, 5, null, null, null ]
        System.out.println("Elemento 4: " + pilha_rubro_negra.getElemento(4)); // 4
    }

    public static void main(String[] args) {
        Scanner leitor = instanciar_scanner();
        //int capacidade = ler_inteiro(leitor);
        PilhaRubroNegra pilha_rubro_negra = new PilhaRubroNegra(1);
        testes_de_push();
        System.out.println(pilha_rubro_negra.isEmpty());
        System.out.println(pilha_rubro_negra.pop());

        desinstanciar_scanner(leitor);
    }
}