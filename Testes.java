public class Testes {
    public static void main(String[] args) {
        PilhaNegra pilha_negra = new PilhaNegra(5);
        for(int i = pilha_negra.getTamanho() - 1; i > -1; i--) {
            pilha_negra.push(i);
        }
        pilha_negra.push(99);
        pilha_negra.push(98);

        System.out.println("PilhaNegra.top(): " + pilha_negra.top());
        pilha_negra.status();
    }
}