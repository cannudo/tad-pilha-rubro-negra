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

    public static void pedir_numero_maior_que_zero() {
        System.out.print("Digite a capacidade da pilha (deve ser maior que zero): ");
    }

    public static void status_da_pilha(PilhaRubroNegra pilha_rubro_negra) {
        System.out.println("");
        System.out.println("Capacidade da pilha: " + pilha_rubro_negra.getTamanho());
        System.out.println("Indice do topo rubro: " + pilha_rubro_negra.get_top_index_rubro());
        System.out.println("Pilha vazia? " + pilha_rubro_negra.isEmptyRubro());
        System.out.print("Pilha: ");
        pilha_rubro_negra.listar_elementos();
        System.out.println("");
    }

    public static void imprimir_menu() {
        System.out.println("");
        System.out.println("0 - Ver status da pilha");
        System.out.println("1 - Adicionar elemento");
        System.out.println("2 - Remover elemento");
        System.out.println("99 - Sair");
    }

    public static void main(String[] args) {
        Scanner leitor = instanciar_scanner();
        int capacidade = 0, opcao = 0;
        while(capacidade <= 0) {
            pedir_numero_maior_que_zero();
            capacidade = ler_inteiro(leitor);
        }
        PilhaRubroNegra pilha_rubro_negra = new PilhaRubroNegra(capacidade);

        while(opcao != 99) {
            imprimir_menu();
            opcao = ler_inteiro(leitor);
            switch(opcao) {
                case 0:
                    status_da_pilha(pilha_rubro_negra);
                    break;
                case 1:
                    System.out.print("Digite um numero: ");
                    int numero = ler_inteiro(leitor);
                    pilha_rubro_negra.pushRubro(numero);
                    break;
                case 2:
                    try {
                        System.out.println("Elemento removido: " + pilha_rubro_negra.popRubro());
                    } catch(PilhaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 99:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
        desinstanciar_scanner(leitor);
    }
}