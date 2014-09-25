
import javax.swing.JOptionPane;

/*
 * 

/**
 *
 * @author Aluno
 */
public class Pilha {
    
    
    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos;
    int p[];

    public Pilha(){
        inicio = fim = -1;
        tamanho = 100;
        p = new int[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia(){
        return qtdeElementos == 0;
    }

    public boolean estaCheia(){
        return qtdeElementos == tamanho - 1;
    }

    public void adicionar(int e){
        if (! estaCheia()){
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            p[fim] = e;
            qtdeElementos++;
        }
    }
    public void remover(){
        if (! estaVazia() ){
            fim --;
            qtdeElementos --;
        }
    }
    public void mostrar(){
        String elementos = "";
        for (int i = fim; i>=0; i--) {
            elementos += p[i]+ " - ";
        }
        JOptionPane.showMessageDialog(null, elementos);
     }

    void insere(Peca pecaInsere) {
        throw new UnsupportedOperationException("Não Suporta"); 
    }

    Peca remove() {
        throw new UnsupportedOperationException("Não Suporta"); 
    }

    boolean vazia() {
        throw new UnsupportedOperationException("Não Suporta");
    }
}

/**
 *
 * @author Aluno
 */
public class PilhaAplicacao {

public  void main(String[] args)
{
    Pilha p = new Pilha();
    p.adicionar(10);
    p.adicionar(12);
    p.adicionar(30);
    p.mostrar();
    p.remover();
    p.mostrar();
}

}
    

    
