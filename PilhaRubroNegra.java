public class PilhaRubroNegra implements PilhaInterface {
    private int tamanho;
    private int capacidade;
    private int indice;
    public Object[] pilha;

    public PilhaRubroNegra(int capacidade) {
        this.capacidade = capacidade;
        this.pilha = new Object[this.capacidade];
        this.indice = -1;
    }
    public boolean isEmpty() {
        return this.indice == -1;
    }

    public Object top() {
        if (this.isEmpty()) {
            throw new PilhaVaziaException("A pilha está vazia.");
        }
        return this.pilha[0];
    }

    public void push(Object objeto) {
        this.pilha[0] = objeto;
        this.indice++;
        System.out.println("Elemento inserido com sucesso.");
    }
}