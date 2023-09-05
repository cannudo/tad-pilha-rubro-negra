public class PilhaVermelhaEPreta {
    Object[] array = new Object[100];
    
    public int sizeP() {
      return 0;
    }    
    public boolean isEmptyP();
    public Object topP() throws PilhaVaziaExcecao;
    public void pushP(Object o);
    public Object popP() throws PilhaVaziaExcecao;
  
    public int sizeV();    
    public boolean isEmptyV();
    public Object topV() throws PilhaVaziaExcecao;
    public void pushV(Object o);
    public Object popV() throws PilhaVaziaExcecao;
  }