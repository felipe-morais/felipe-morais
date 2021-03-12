public class Lista {
    private Caixinha inicio;

    // criando lista vazia
    public Lista() {
        this.inicio = null;
    }

    public void inserir(int elemento) {
        // tenho que criar nova caixinha
        Caixinha nova = new Caixinha();
        nova.setElemento(elemento); // inseri elemento na caixinha
        nova.setProximo(null); // depois dela nao vem ninguem

        if (inicio == null) { // vai ser a 1a caixinha?
            inicio = nova;
        } else { // ja tem gente na lista
            Caixinha aux;
            aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }

    }

    public int retirar() {
        // este metodo considera q a lista sempre tem elementos
        if (inicio != null){
        Caixinha aux = inicio;
        int elemento = aux.getElemento();
        inicio = aux.getProximo();
        return elemento;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Nada a fazer - lista está vazia");
        } else {
            Caixinha aux = inicio;
            while (aux != null) {
                System.out.println("Elemento visto " + aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }

    public boolean isEmpty() {
        return this.inicio == null;
    }
}
