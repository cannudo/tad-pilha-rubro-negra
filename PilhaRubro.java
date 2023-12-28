import java.util.Scanner;

public class PilhaRubro implements PilhaInterface {
    private int tamanho, top_index;
    private Object[] pilha;

    public PilhaRubro(int tamanho) {
        this.tamanho = tamanho;
        this.top_index = -1;
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
        for (int i = 0; i < this.getTamanho(); i++) {
            System.out.printf(" [ " + this.getElemento(i) + " ], ");
        }
        System.out.println();
    }

    private void duplicar_tamanho() {
        int tamanho_antigo = this.getTamanho();
        Object[] pilha_auxiliar = new Object[tamanho_antigo * 2];
        this.setTamanho(tamanho_antigo * 2);
        for (int i = 0; i < this.pilha.length; i++) {
            pilha_auxiliar[i] = this.pilha[i];
        }
        this.pilha = pilha_auxiliar;
        System.out.println();
        System.out.println("Tamanho duplicado de " + tamanho_antigo + " para " + this.getTamanho() + ".");
        System.out.println();
    }

    public Object top() {
        Object elemento = null;
        if (!this.isEmpty()) {
            elemento = this.pilha[this.get_top_index()];
        } else {
            throw new PilhaVaziaException("top(): nenhum elemento para retornar.");
        }
        return elemento;
    }

    public Object pop() {
        Object elemento = null;
        if (!this.isEmpty()) {
            elemento = this.pilha[this.get_top_index()];
            this.pilha[this.get_top_index()] = null;
            this.top_index--;
        } else {
            throw new PilhaVaziaException("pop(): nenhum elemento para remover.");
        }
        return elemento;
    }

    public void push(Object dado) {
        boolean tem_espaco = this.get_top_index() < this.getTamanho() - 1;
        if (tem_espaco) {
            this.top_index++;
            this.pilha[this.get_top_index()] = dado;
        } else {
            this.duplicar_tamanho();
            this.push(dado);
        }
    }

    public boolean isEmpty() {
        return this.get_top_index() == -1;
    }

    public int size() {
        return this.getTamanho() + 1;
    }

}