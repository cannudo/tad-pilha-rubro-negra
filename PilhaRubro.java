public class PilhaRubro {
    private int capacidade, topo;
    private Object[] array;

    public PilhaRubro(int capacidade) {
        if(capacidadeEhValorNegativo(capacidade)) throw new PilhaVaziaException("A capacidade da pilha deve ser maior que 0");
        this.capacidade = capacidade;
        this.topo = -1;
        this.array = new Object[capacidade];
    }

    public boolean capacidadeEhValorNegativo(int capacidade) {
        return capacidade <= 0;
    }

    public int getTopo() {
        return this.topo;
    }

    public void setCapacidade(int novaCapacidade) {
        this.capacidade = novaCapacidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    //public Object getElemento(int indice) {
    //    return this.pilha[indice];
    //}

    //public void listar_elementos() {
    //    for (int i = 0; i < this.getTamanho(); i++) {
    //        System.out.printf(" [ " + this.getElemento(i) + " ], ");
    //    }
    //    System.out.println();
    //}

    //private void duplicar_tamanho() {
    //    int tamanho_antigo = this.getTamanho();
    //    Object[] pilha_auxiliar = new Object[tamanho_antigo * 2];
    //    this.setTamanho(tamanho_antigo * 2);
    //    for (int i = 0; i < this.pilha.length; i++) {
    //        pilha_auxiliar[i] = this.pilha[i];
    //    }
    //    this.pilha = pilha_auxiliar;
    //    System.out.println();
    //    System.out.println("Tamanho duplicado de " + tamanho_antigo + " para " + this.getTamanho() + ".");
    //    System.out.println();
    //}

    //public Object top() {
    //    Object elemento = null;
    //    if (!this.isEmpty()) {
    //        elemento = this.pilha[this.get_top_index()];
    //    } else {
    //        throw new PilhaVaziaException("top(): nenhum elemento para retornar.");
    //    }
    //    return elemento;
    //}

    //public Object pop() {
    //    Object elemento = null;
    //    if (!this.isEmpty()) {
    //        elemento = this.pilha[this.get_top_index()];
    //        this.pilha[this.get_top_index()] = null;
    //        this.top_index--;
    //    } else {
    //        throw new PilhaVaziaException("pop(): nenhum elemento para remover.");
    //    }
    //    return elemento;
    //}

    //public void push(Object dado) {
    //    boolean tem_espaco = this.get_top_index() < this.getTamanho() - 1;
    //    if (tem_espaco) {
    //        this.top_index++;
    //        this.pilha[this.get_top_index()] = dado;
    //    } else {
    //        this.duplicar_tamanho();
    //        this.push(dado);
    //    }
    //}

    public boolean estaVazia() {
        return this.getTopo() == -1;
    }

    public boolean estaCheia() {
        return this.getTopo() + 1 == this.getCapacidade();
    }

    public int tamanho() {
        return this.getTopo() + 1;
    }

    public static void main(String[] args) {
        PilhaRubro pilha = new PilhaRubro(1);
        System.out.println("Deus, sou eu de novo. Me ajude a debugar.");
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.estaCheia());
        System.out.println("Deus, sou eu de novo. Me ajude a debugar.");
    }

}