public class linhasDeTransmissao {
    public static boolean elementoAEsquerdaEhMenor(int elemento_a_esquerda, int elemento) {
        return elemento_a_esquerda < elemento;
    }

    public static void main(String[] args) {
        int[] p = new int[5];
        p[0] = 3;
        p[1] = 6;
        p[2] = 2;
        p[3] = 7;
        p[4] = 5;

        for(int i = 0; i <= 4; i++) {
            if (i == 0) {
                continue;
            } else {
                int elemento = p[i];
                int elemento_a_esquerda = p[i - 1];
                System.out.println(elemento_a_esquerda + " é menor que " + elemento + "? ~~> " + (elementoAEsquerdaEhMenor(elemento_a_esquerda, elemento) ? "Sim" : "Não"));
            }
        }
    }
}