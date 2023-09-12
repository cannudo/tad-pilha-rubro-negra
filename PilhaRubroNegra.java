import java.util.Scanner;

public class PilhaRubroNegra implements PilhaInterface {
    private int tamanho, top_index_rubro;
    private Object[] pilha;

    public PilhaRubroNegra(int tamanho) {
        this.tamanho = tamanho;
        this.top_index_rubro = -1;
        this.pilha = new Object[tamanho];
    }

    public int get_top_index_rubro() {
        return this.top_index_rubro;
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

    public Object topRubro() {
        Object elemento = null;
        if (!this.isEmptyRubro()) {
            elemento = this.pilha[this.get_top_index_rubro()];
        } else {
            throw new PilhaVaziaException("topRubro(): nenhum elemento para retornar.");
        }
        return elemento;
    }

    public Object popRubro() {
        Object elemento = null;
        if (!this.isEmptyRubro()) {
            elemento = this.pilha[this.get_top_index_rubro()];
            this.pilha[this.get_top_index_rubro()] = null;
            this.top_index_rubro--;
        } else {
            throw new PilhaVaziaException("popRubro(): nenhum elemento para remover.");
        }
        return elemento;
    }

    public void pushRubro(Object dado) {
        boolean tem_espaco = this.get_top_index_rubro() < this.getTamanho() - 1;
        if (tem_espaco) {
            this.top_index_rubro++;
            this.pilha[this.get_top_index_rubro()] = dado;
        } else {
            this.duplicar_tamanho();
            this.pushRubro(dado);
        }
    }

    public boolean isEmptyRubro() {
        return this.get_top_index_rubro() == -1;
    }

    public int sizeRubro() {
        return this.getTamanho() + 1;
    }

}