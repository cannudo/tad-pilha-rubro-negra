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

    public static void status_da_pilha(PilhaRubro pilha_rubro) {
        System.out.println("");
        System.out.println("Capacidade da pilha: " + pilha_rubro.getTamanho());
        System.out.println("Indice do topo rubro: " + pilha_rubro.get_top_index());
        System.out.println("Pilha vazia? " + pilha_rubro.isEmpty());
        System.out.print("Pilha: ");
        pilha_rubro.listar_elementos();
        System.out.println("");
    }

    public static void imprimir_menu() {
        System.out.println("");
        System.out.println("0 - Ver status da pilha");
        System.out.println("1 - Push rubro");
        System.out.println("2 - Push negro");
        System.out.println("3 - Pop rubro");
        System.out.println("4 - Pop negro");
        System.out.println("99 - Sair");
    }

    public static void main(String[] args) {
        Scanner leitor = instanciar_scanner();
        int capacidade = 0, opcao = 0;
        while(capacidade <= 0) {
            pedir_numero_maior_que_zero();
            capacidade = ler_inteiro(leitor);
        }
        PilhaRubroNegra pilha = new PilhaRubroNegra(capacidade);
        while(opcao != 99) {
            imprimir_menu();
            opcao = ler_inteiro(leitor);
            switch(opcao) {
                case 0:
                    pilha.status();
                    break;
                case 1:
                    pilha.pushRubro("0");
                    break;
                case 2:
                    pilha.pushNegro("1");
                    break;
                case 3:
                    pilha.popRubro();
                    break;
                case 4:
                    pilha.popNegro();
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