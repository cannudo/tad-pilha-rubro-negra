public class PilhaRubroNegra implements interface_ {
    private int capacidade;
    private int tamanhoRubro;
    private int tamanhoNegro;
    private int topoRubro;
    private int topoNegro;

    public PilhaRubroNegra(int capacidade) {
        this.capacidade = capacidade;
        this.tamanhoRubro = 0;
        this.tamanhoNegro = 0;
        this.topoRubro = -1;
        this.topoNegro = capacidade;
    }

    public int tamanhoRubro() {
        return this.tamanhoRubro;
    }

    public int tamanhoNegro() {
        return this.tamanhoNegro;
    }

    public boolean estaVaziaRubro() {
        return this.tamanhoRubro == 0;
    }

    public boolean estaVaziaNegro() {
        return this.tamanhoNegro == 0;
    }

 public Object popNegro() throws PilhaEstaVaziaException {
    if (estaVaziaNegro()) {
        throw new PilhaEstaVaziaException("popNegro(): a pilha negra está vazia.");
    }
    return Object;
 }   
}