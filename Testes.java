public class Testes {

    public static void status_pilha(PilhaNegra pilha) {
        System.out.println("Tamanho da pilha: " + pilha.getTamanho());
        //System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Elementos da pilha: ");
        pilha.listar_elementos();
        System.out.println();
    }

    public static void main(String[] args) {
        PilhaNegra pilha_negra = new PilhaNegra(5);
        status_pilha(pilha_negra);
        pilha_negra.duplicar_tamanho();
        status_pilha(pilha_negra);
        pilha_negra.duplicar_tamanho();
        status_pilha(pilha_negra);
    }
}