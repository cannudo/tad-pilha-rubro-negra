public class PilhaNegra implements PilhaInterface {
    private int tamanho, top_index;
    private Object[] pilha;

    public pilhaNegra(int tamanho) {
        this.tamanho = tamanho;
        this.top_index = tamanho;
        this.pilha = new Object[tamanho];
    }

    public int get_top_index() {
        return this.top_index;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void getTamanho() {
        return this.tamanho;
    }

    public Object getElemento(int indice) {
        return this.pilha[indice];
    }

    public void listar_elementos() {
        for(int i = this.tamanho -1; i > 0; i--) {
            System.out.printf(" [ " + this.getElemento[i] + " ], ")
        }
        System.out.println();
    }
}