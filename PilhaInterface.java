public interface PilhaInterface {
        
    /*
     * size(): @return número de elementos empilhados;
     * isEmpty(): @return booleano indicando se a pilha está vazia;
     * top(): @return elemento <objeto> do topo da pilha @throws PilhaVaziaException;
     * push(objeto): empilha o elemento <objeto>;
     * pop(): remove o último elemento empilhado @return elemento no topo da
     * pilha @throws PilhaVaziaException;
     */

   // public abstract int size();
   // public abstract boolean isEmpty();
   public abstract Object top() throws PilhaVaziaException;
   // public abstract void push(Object objeto);
   // public abstract Object pop() throws PilhaVaziaException;
}