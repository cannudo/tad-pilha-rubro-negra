public class PilhaNegra {
    private int tamanho, top_index;
    public Object[] pilha;

    public PilhaNegra(int tamanho) {
        this.tamanho = this.top_index = tamanho;
        this.pilha = new Object[tamanho];
    }

    public void push(Object dado) {
        if(this.isFull()) {
            int tamanho_antigo = this.getTamanho();
            int tamanhoDobrado = this.dobroDoTamanho();
            Object[] aux = new Object[tamanhoDobrado];            
            for(int i = tamanho_antigo - 1; i > -1; i--) {
                aux[tamanhoDobrado - 1] = this.pilha[i];
                tamanhoDobrado--;
            }
            this.pilha = aux;
            this.setTamanho(this.dobroDoTamanho());
            this.setTop_index(tamanho_antigo);
            this.push(dado);
        } else {
            this.decrementarTop_index();
            this.pilha[getTop_index()] = dado;
        }
    }

    public Object top() {
        if(this.isEmpty()) {
            throw new PilhaVaziaException("PilhaNegra.top(): nenhum elemento para remover.");
        } else {
            return this.pilha[this.getTop_index()];
        }
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTop_index() {
        return this.top_index;
    }

    public void setTop_index(int valor) {
        this.top_index = valor;
    }

    public void decrementarTop_index() {
        this.top_index--;
    }

    public boolean isFull() {
        return this.getTop_index() == 0;
    }

    public boolean isEmpty() {
        return this.getTop_index() == this.getTamanho();
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public int dobroDoTamanho() {
        return this.tamanho * 2;
    }

    public void status() {
        System.out.println("Tamanho da pilha: " + tamanho);
        System.out.println("Índice do topo: " + top_index);
        System.out.println("A pilha está cheia? " + (this.isFull() ? "Sim" : "Não"));
        System.out.println("A pilha está vazia? " + (this.isEmpty() ? "Sim" : "Não"));
        if(!this.isEmpty()) {
            System.out.println("Elementos na pilha: ");

            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for(int i = 0; i < this.getTamanho(); i++) {
                sb.append(this.pilha[i]);
                if(i < this.getTamanho() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            System.out.println(sb.toString());    
        }
    }

}