public interface interface_ {
    public int tamanhoRubro();
    public int tamanhoNegro();
    public boolean estaVaziaRubro();
    public boolean estaVaziaNegro();
    public Object topoRubro() throws PilhaVaziaExcecao;
    public Object topoNegro() throws PilhaVaziaExcecao;
    public void empilharRubro(Object o);
    public void empilharNegro(Object o);
    public Object desempilharRubro() throws PilhaVaziaExcecao;
    public Object desempilharNegro() throws PilhaVaziaExcecao;
}