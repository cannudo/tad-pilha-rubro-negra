public class PilhaRubroNegra {
    private int capacidade, topIndexNegro, topIndexRubro;
    private String[] pilha;

    public PilhaRubroNegra(int capacidade) {
        this.capacidade = capacidade;
        this.topIndexRubro = -1;
        this.topIndexNegro = capacidade;
        this.pilha = new String[capacidade];
    }


    public void pushRubro(String dado) {
        if(!this.isFull()) {
            this.topIndexRubro++;
            this.pilha[this.topIndexRubro] = dado;
        } else {
            System.out.println("pushRubro(): Pilha cheia.");
        }
    }

    public void pushNegro(String dado) {
        if (!this.isFull()) {
            this.topIndexNegro--;
            this.pilha[this.topIndexNegro] = dado;
        } else {
            System.out.println("pushNegro(): Pilha cheia.");
        }
    }

    public String topRubro() {
        if(this.isEmpty()) {
            throw new PilhaVaziaException("topRubro(): Pilha vazia.");
        } else {
            return this.pilha[this.topIndexRubro];
        }
    }

    public String topNegro() {
        if(this.isEmpty()) {
            throw new PilhaVaziaException("topNegro(): Pilha vazia.");
        } else {
            return this.pilha[this.topIndexNegro];
        }
    }

    public boolean isEmpty() {
        return (this.topIndexNegro == -1 && this.topIndexRubro == this.capacidade);
    }

    public boolean isFull() {
        return (this.topIndexRubro + 1 == this.topIndexNegro);
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int novaCapacidade) {
        this.capacidade = novaCapacidade;
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
        System.out.println("Está vazia? " + (this.isEmpty() ? "Sim" : "Não"));
        System.out.println("Está cheia? " + (this.isFull() ? "Sim" : "Não"));
        if(!this.isEmpty()) {
            System.out.println("Pilha: ");
            this.listarStrings();
        }
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
        PilhaRubroNegra teste = new PilhaRubroNegra(4);
        teste.pushNegro("😊");
        teste.pushRubro("🌟");
        teste.pushNegro("🐱");
        teste.pushRubro("🐶");
        teste.pushNegro("🐭"); // linha 1 da saída
        teste.status();
    }
}