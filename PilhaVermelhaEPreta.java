public class PilhaVermelhaEPreta {
  private int topoVermelho, topoPreto, capacidade;
  private Object[] pilha;

  public PilhaVermelhaEPreta(int capacidade) {
    this.capacidade = capacidade;
    this.topoVermelho = -1;
    this.topoPreto = capacidade;
    this.pilha = new Object[capacidade];
  }

  public int tamanhoVermelho() {
    return this.topoVermelho + 1;
  }

  public int tamanhoPreto() {
    return this.capacidade - this.topoPreto;
  }

  public void botaVermelho(Object obj) {
    if (this.tamanhoVermelho() == this.capacidade) {
      throw new RuntimeException("Pilha vermelha cheia");
    }

    this.pilha[++this.topoVermelho] = obj;
  }

  public void botaPreto(Object obj) {
    if (this.tamanhoPreto() == this.capacidade) {
      throw new RuntimeException("Pilha preta cheia");
    }

    this.pilha[--this.topoPreto] = obj;
  }

  public Object tiraVermelho() {
    if (this.tamanhoVermelho() == 0) {
      throw new RuntimeException("Pilha vermelha vazia");
    }

    return this.pilha[this.topoVermelho--];
  }

  public Object tiraPreto() {
    if (this.tamanhoPreto() == 0) {
      throw new RuntimeException("Pilha preta vazia");
    }

    return this.pilha[this.topoPreto++];
  }

  private void dobrarCapacidade() {
    Object[] novaPilha = new Object[this.capacidade * 2];

    for (int i = 0; i <= this.topoVermelho; i++) {
      novaPilha[i] = this.pilha[i];
    }

    for (int i = this.capacidade - 1; i >= this.topoPreto; i--) {
      novaPilha[i * 2] = this.pilha[i];
    }
    
    this.topoPreto = this.capacidade * 2 - this.topoPreto;
    this.capacidade *= 2;
    this.pilha = novaPilha;
  }
}