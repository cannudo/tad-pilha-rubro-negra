public class Testes {
    public static void main(String[] args) {
        PilhaRubro rubro = new PilhaRubro(3);
        PilhaNegra negra = new PilhaNegra(3);
        PilhaRubroNegra rubroNegra = new PilhaRubroNegra(3);
        for(int i = 0; i < 4; i++) {
            rubro.push(i);
            negra.push(i);
            rubroNegra.pushRubro(" " + i + " ");
            rubroNegra.pushNegro(" " + i + " ");
        }

        for(int i = 0; i < 4; i++) {
            rubro.pop();
            negra.pop();
            rubroNegra.popRubro();
            rubroNegra.popNegro();
        }
        System.out.println();
    }
}