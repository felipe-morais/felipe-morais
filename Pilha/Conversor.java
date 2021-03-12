import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite algum numero ai velho");
        int numero = sc.nextInt();
        sc.close();
        Pilha p = new Pilha();

        int resto;

        // fase 1 - empilhamento dos restos
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
    }
}
