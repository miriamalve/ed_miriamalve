package er1;

import .*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Jogadores1 {
 
   
 private String nome;
 private  int altura;
 private int idade;
 
  public Jogadores1(String n, int a, int id)
      {                               // comentario aqui
      nome = n;
      altura = a;
      idade = id;
      }
//--------------------------------------------------------------
   public void displayPessoa()
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", altura: " + altura);
      System.out.println(", Idade: " + idade);
      }
//--------------------------------------------------------------
   public String getNome()           // comentario aqui
      { return nome; }
   }  // Final da Classe Pessoa
    

