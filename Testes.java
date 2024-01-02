public class Testes {

    public static void status_pilha(PilhaNegra pilha) {
        System.out.println("Tamanho da pilha: " + pilha.getTamanho());
        System.out.println("Indíce do topo: " + pilha.get_top_index());
        System.out.println("Pilha cheia? " + (pilha.get_top_index() == 0));
        System.out.println("Elementos da pilha: ");
        pilha.listar_elementos();
        System.out.println();
    }

    public static void main(String[] args) {
        PilhaNegra pilha_negra = new PilhaNegra(5);
        int maximo = pilha_negra.getTamanho();
        for(int i = maximo - 1; i >= 0; i--) {
            pilha_negra.push(i);
        }
        status_pilha(pilha_negra);
    }
}