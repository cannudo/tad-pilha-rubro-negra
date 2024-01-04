public class Testes {
    public static void main(String[] args) {
        PilhaNegra pilha_negra = new PilhaNegra(5);
        for(int i = pilha_negra.getTamanho(); i >= 0; i--) {
            pilha_negra.push(i);
        }
        System.out.println("DEBUG POINT");
        pilha_negra.status();
    }
}