public interface PilhaInterface {        
    /*
     * size(): @return número de elementos empilhados;
     * isEmpty(): @return booleano indicando se a pilha está vazia;
     * top(): @return elemento <objeto> do topo da pilha @throws PilhaVaziaException;
     * push(objeto): empilha o elemento <objeto>;
     * pop(): remove o último elemento empilhado @return elemento no topo da
     * pilha @throws PilhaVaziaException;
     */

   public int size();
   public boolean isEmpty();
   public Object top() throws PilhaVaziaException;
   public void push(Object objeto);
   public abstract Object pop() throws PilhaVaziaException;
}