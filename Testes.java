public class Testes {
    public static void main(String[] args) {
        PilhaNegra pilha_negra = new PilhaNegra(5);
        System.out.println("[PILHA NOVA]");
        pilha_negra.status();
        System.out.println();
        for(int i = pilha_negra.getTamanho() - 1; i >= 0; i--) {
            pilha_negra.pilha[i] = i;
            pilha_negra.decrementarTop_index();    
        }
        System.out.println("DEBUG POINT");
        pilha_negra.status();
    }
}