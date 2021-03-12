public class Conversor {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        int resto;

        IPilha p;

        // fase 1 - empilhamento dos restos
        try {
            p = (IPilha) Class.forName(args[1]).getDeclaredConstructor().newInstance();

            while (numero != 0) {
                resto = numero % 2; // pega resto da divisao do numero por 2
                p.push(resto); // ponho na pilha
                numero = numero / 2; // divide o numero por 2
            }

            // fase 2 - exibicao dos restos
            while (!p.isEmpty()) {
                resto = p.pop(); // remove da pilha o cara q esta no topo
                System.out.print(resto);
            }
        } catch (Exception ex) {
            System.err.println("Deu muito ruim.");
        }
    }
}
