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
public class estrutura {
    private int nElems;
    private long[] a;
    public void insert(long value)    // insere o elemento no vetor
      {
      int n;
      for(n=0; n<nElems;n++)        // localiza onde esse elemento se encaixa
         if(a[n] > value)            // OBS: Usando aqui busca linear!!! Poderia ser binária!
            break;
      for(int k=nElems; k>n; k--)    // move os elementos maiores uma posição p/ frente
         a[k] = a[k-1];
      a[n] = value;                  // insere o elemento na posição necessária
      nElems++;                      // incrementa a variavel de controle de tamanho
      }  // finaliza o méto
    public boolean delete(long value)
      {
      int j = find(value);           //Utiliza a busca binária para remover!!!
      if(j==nElems)                  // caso não encontre, retorna false!
         return false;
      else                           // caso encontre...
         {
         for(int k=j; k<nElems; k++) // move os elementos uma posição pra tras
            a[k] = a[k+1];
         nElems--;                   // decrementa o tamanho
         return true;
         }
}

    private int find(long value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn]==searchKey)
            return curIn;              // encontrei!
         else if(lowerBound > upperBound)
            return nElems;             // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn] < searchKey)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      