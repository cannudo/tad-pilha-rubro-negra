public class PilhaNegra implements PilhaInterface {
    private int tamanho, top_index;
    private Object[] pilha;

    public PilhaNegra(int tamanho) {
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

    public int getTamanho() {
        return this.tamanho;
    }

    public Object getElemento(int indice) {
        return this.pilha[indice];
    }

    public void listar_elementos() {
        for(int i = this.tamanho - 1; i >= 0; i--) {
            System.out.printf(" [ " + this.getElemento(i) + " ], ");
        }
        System.out.println();
    }

    public void duplicar_tamanho() {
        int tamanho_antigo = this.getTamanho();
        Object[] pilha_auxiliar = new Object[tamanho_antigo * 2];
        this.setTamanho(tamanho_antigo * 2);
        for(int i = tamanho_antigo - 1; i >= 0; i--) {
            pilha_auxiliar[i] = i;
        }
        this.pilha = pilha_auxiliar;
        System.out.println();
        System.out.println("Tamanho duplicado de " + tamanho_antigo + " para " + this.getTamanho() + ".");
        System.out.println();
    }

    public void push(Object dado) {
        boolean tem_espaco = this.get_top_index() == 0;
        if (tem_espaco) {
            this.top_index--;
            this.pilha[this.get_top_index()] = dado;
        } else {
            System.out.println("Pilha cheia.");
        }
    }

    public boolean isEmpty() {
        return this.get_top_index() == this.tamanho;
    }

    public int size() {
        return this.getTamanho() + 1;
    }
}