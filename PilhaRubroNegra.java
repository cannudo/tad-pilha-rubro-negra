import java.util.Scanner;

public class PilhaRubroNegra implements PilhaInterface {
    int capacidade, indice_do_topo;
    Object[] pilha;

    public PilhaRubroNegra(int capacidade) {
        this.capacidade = capacidade;
        this.indice_do_topo = -1;
        this.pilha = new Object[capacidade];
    }

    public int getIndice_do_topo() {
        return this.indice_do_topo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public Object getElemento(int indice) {
        return this.pilha[indice];
    }

    public void listar_elementos() {
        for (int i = 0; i < this.getCapacidade(); i++) {
            System.out.printf(" [ " + this.getElemento(i) + " ], ");
        }
        System.out.println();
    }

    public void duplicar_capacidade() {
        int aux = this.getCapacidade();
        this.setCapacidade(this.getCapacidade() * 2);
        Object[] pilha_auxiliar = new Object[this.getCapacidade()];
        for (int i = 0; i < this.pilha.length; i++) {
            pilha_auxiliar[i] = this.pilha[i];
        }
        this.pilha = pilha_auxiliar;
        //this.indice_do_topo = aux - 1;
        System.out.println("Capacidade duplicada de " + aux + " para " + this.getCapacidade() + ".");
    }

    public Object top() {
        Object elemento = null;
        if (!this.isEmpty()) {
            elemento = this.pilha[this.getIndice_do_topo()];
        } else {
            throw new PilhaVaziaException("top(): nenhum elemento para retornar.");
        }
        return elemento;
    }

    public Object pop() {
        Object elemento = null;
        if (!this.isEmpty()) {
            elemento = this.pilha[this.getIndice_do_topo()];
            this.pilha[this.getIndice_do_topo()] = null;
            this.indice_do_topo--;
        } else {
            throw new PilhaVaziaException("pop(): nenhum elemento para remover.");
        }
        return elemento;
    }

    public void push(Object dado) {
        if (this.getIndice_do_topo() < this.getCapacidade() - 1) {
            this.indice_do_topo++;
            this.pilha[this.getIndice_do_topo()] = dado;
        } else {
            this.duplicar_capacidade();
            this.push(dado);
        }
    }

    public boolean isEmpty() {
        return this.getIndice_do_topo() == -1;
    }

    public int size() {
        return this.getCapacidade() + 1;
    }

}