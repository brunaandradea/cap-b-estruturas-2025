package application.pilha;

public class PilhaSimples {
    private String [] itens;
    private int tamanho;
    private int topo;

    public PilhaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.itens = new String[this.tamanho];
        this.topo = -1;
    }

    public void empilhar (String valor) {
        if(topo == (tamanho - 1)) {
            System.out.println("Pilha Cheia!!!");
        } else {
            // topo++;
            // itens[topo] = valor;

            itens[++topo] = valor;
        }
    }

    public String desempilhar() {
        String resultado = "";
        if(topo == -1) {
            System.out.println("Pilha Vazia");
        } else {
            // resultado = itens[topo];
            // topo--;
            resultado = itens[topo--];
        }

        return resultado;
    }

    @Override
    public String toString() {
        String resultado = "";
        if(topo >= 0) {
            for(int cont = 0;cont <= topo;cont++) {
                resultado += itens[cont];
            }
        }

        return resultado;
    }
}
