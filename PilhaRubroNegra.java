public class PilhaRubroNegra {
    private int capacidade, topIndexNegro, topIndexRubro;
    private String[] pilha;

    public PilhaRubroNegra(int capacidade) {
        this.capacidade = capacidade;
        this.topIndexRubro = -1;
        this.topIndexNegro = capacidade;
        this.pilha = new String[capacidade];
    }

    public void duplicarTamanho() {
        int quantosNegros = this.getTamanhoPilhaNegra();
        int quantosRubros = this.getTamanhoPilhaRubro();
        int tamanhoAntigo = this.getCapacidade();
        String copia[] = new String[capacidade];
        for(int i = 0; i < this.getCapacidade(); i++) {
            copia[i] = this.pilha[i];
        }
        this.capacidade = tamanhoAntigo * 2;
        this.topIndexRubro = -1;
        this.topIndexNegro = this.getCapacidade();
        this.pilha = new String[tamanhoAntigo * 2];
        if(quantosRubros > 0) {
            for(int i = 0; i < quantosRubros; i++) {
                this.pushRubro(copia[i]);
            }    
        }
        if(quantosNegros > 0) {
            for(int i = 0; i < quantosNegros; i++) {
                this.pushNegro(copia[tamanhoAntigo - i - 1]);
            }

        }
    }
    
    public int getTamanhoPilhaNegra() {
        return this.getCapacidade() - this.getTopIndexNegro();
    }

    public int getTamanhoPilhaRubro() {
        return this.getTopIndexRubro() + 1;
    }

    public void pushRubro(String dado) { 
        if(!this.estaCheia()) {
            this.topIndexRubro++;
            this.pilha[this.topIndexRubro] = dado;
        } else {
            this.duplicarTamanho();
            this.pushRubro(dado);
        }
    }

    public void pushNegro(String dado) {
        if (!this.estaCheia()) {
            this.topIndexNegro--;
            this.pilha[this.topIndexNegro] = dado;
        } else {
            this.duplicarTamanho();
            this.pushNegro(dado);
        }
    }

    public String topRubro() {
        if(this.estaVazia()) {
            throw new PilhaVaziaException("topRubro(): Pilha vazia.");
        } else {
            return this.pilha[this.topIndexRubro];
        }
    }

    public String topNegro() {
        if(this.estaVazia()) {
            throw new PilhaVaziaException("topNegro(): Pilha vazia.");
        } else {
            return this.pilha[this.topIndexNegro];
        }
    }

    public String popRubro() {
        String elemento = null;
        if(!this.estaVazia()) {
            elemento = this.pilha[this.getTopIndexRubro()];
            this.pilha[this.getTopIndexRubro()] = null;
            this.topIndexRubro--;
        } else {
            throw new PilhaVaziaException("popRubro(): nenhum elemento para remover.");
        }

        return elemento;
    }

    public String popNegro() {
        String elemento = null;
        if(!this.estaVazia()) {
            elemento = this.pilha[this.getTopIndexNegro()];
            this.pilha[this.getTopIndexNegro()] = null;
            this.topIndexNegro++;
        } else {
            throw new PilhaVaziaException("popNegro(): nenhum elemento para remover.");
        }

        return elemento;
    }

    public boolean estaVazia() {
        return (this.topIndexRubro == -1 && this.topIndexNegro == this.capacidade);
    }

    public boolean estaCheia() {
        return (!this.estaVazia() && this.topIndexRubro + 1 == this.topIndexNegro);
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
        System.out.println("Está vazia? " + (this.estaVazia() ? "Sim" : "Não"));
        System.out.println("Está cheia? " + (this.estaCheia() ? "Sim" : "Não"));
        if(!this.estaVazia()) {
            System.out.println("Pilha: ");
            this.listarStrings();
            System.out.println("Contagem de dados rubros empilhados: " + this.getTamanhoPilhaRubro());
            System.out.println("Contagem de dados negros empilhados: " + this.getTamanhoPilhaNegra());
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
        PilhaRubroNegra teste = new PilhaRubroNegra(1);
        teste.pushRubro("5");
        teste.status();
        teste.pushRubro("3");
        teste.status();
        teste.popRubro();
        teste.status();
        teste.pushRubro("7");
        teste.status();
        teste.popRubro();
        teste.status();
        System.out.println(teste.topRubro());
        teste.popRubro();
        teste.status();
        // teste.popRubro(); // TODO: tratar exceptions
        System.out.println(teste.estaVazia());
        teste.pushRubro("9");
        teste.status();
        teste.pushRubro("7");
        teste.status();
        teste.pushRubro("3");
        teste.status();
        teste.pushRubro("5");
        // teste.size(); // Era pra sair 4 TODO
        teste.popRubro();
        teste.status();
        teste.pushRubro("8");
        teste.status();
        teste.popRubro(); 
        teste.status();
        teste.popRubro(); 
        teste.status();
    }
}