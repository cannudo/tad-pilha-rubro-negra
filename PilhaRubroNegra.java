public class PilhaRubroNegra implements PilhaInterface {
    private int tamanho;

    public PilhaRubroNegra() {
        tamanho = 0;
    }
    public boolean isEmpty() {
        return tamanho == 0;
    }

    public Object top() {
        if (this.isEmpty()) {
            throw new PilhaVaziaException("A pilha está vazia.");
        }
        return null;
    }
}