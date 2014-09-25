/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
class Peca {
    public class Pilha {

//Cria um vedor to tipo Object para armazenar a pilha

public Object[] pilha;

// cria uma variável com o nome ponteiro que vai apontar para o topo da pilha

public int ponteiro;
        private p empilhar;

// inicializa a pilha

public Pilha(){

this.ponteiro=-1;

this.pilha = new Object[1000];

}

// verifica se a pilha esta vazia

public boolean pilhaVazia(){

return this.ponteiro==-1;

}

// verifica o tamanho da pilha

public int tamanho(){

if(this.pilhaVazia()){

return 0;

}

return this.ponteiro+1;

}

// Exibe o topo da pilha

public Object exibeUltimoValor(){

if(this.pilhaVazia()){

return null;

}

return this.pilha[this.ponteiro];

}

// Retira o ultimo elemento da pilha

public Object desempilhar(){

if(pilhaVazia()){

return null;

}

return this.pilha[this.ponteiro--];

}

// insere um novo elemento na pilha

public void empilhar(Object valor){

if(this.ponteiro<this.pilha.length-1){

this.pilha[++ponteiro]=valor;

}

}

// Implementação da pilha

Pilha p = new Pilha();
p= empilhar

p.empilhar(“Primeiro a entrar”);

p.empilhar(“Segundo”);

p.empilhar(“Terceiro”);

p.empilhar(4);

System.out.println(p.exibeUltimoValor());

while(p.pilhaVazia()==fal{

System.out.println(p.desempilhar());
return (null);

}

}
