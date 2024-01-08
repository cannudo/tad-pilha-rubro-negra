public class PilhaRubroNegra {
    private int capacidade, topIndexNegro, topIndexRubro;
    private String[] pilha;

    public PilhaRubroNegra(int capacidade) {
        this.capacidade = capacidade;
        this.topIndexNegro = -1;
        this.topIndexRubro = capacidade;
        this.pilha = new String[capacidade];
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getTopIndexNegro() {
        return topIndexNegro;
    }

    public int getTopIndexRubro() {
        return topIndexRubro;
    }

    public void status() {
        System.out.println("Capacidade: " + this.getCapacidade());
        System.out.println("TopIndexNegro: " + this.getTopIndexNegro());
        System.out.println("TopIndexRubro: " + this.getTopIndexRubro());
        System.out.println("Pilha: ");
        this.listarStrings();
    }

    public void listarStrings() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.getCapacidade(); i++) {
            sb.append(this.getStringNaPosicao(i));
            if(i < this.getCapacidade() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public String getStringNaPosicao(int posicao) {
        return pilha[posicao];
    }

    public static void main(String[] args) {
        PilhaRubroNegra teste = new PilhaRubroNegra(5);
        teste.status();
    }
}