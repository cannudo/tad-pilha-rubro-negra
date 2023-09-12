public interface PilhaInterface {
        
    /*
     * size(): @return número de elementos empilhados;
     * isEmpty(): @return booleano indicando se a pilha está vazia;
     * top(): @return elemento <objeto> do topo da pilha @throws PilhaVaziaException;
     * push(objeto): empilha o elemento <objeto>;
     * pop(): remove o último elemento empilhado @return elemento no topo da
     * pilha @throws PilhaVaziaException;
     */

   public int sizeRubro();
   //public int sizeNegro();
   public boolean isEmptyRubro();
   //public boolean isEmptyNegro();
   public Object topRubro() throws PilhaVaziaException;
   //public Object topNegro() throws PilhaVaziaException;
   public void pushRubro(Object objeto);
   //public void pushNegro(Object objeto);
   public Object popRubro() throws PilhaVaziaException;
   //public Object popNegro() throws PilhaVaziaException;
}