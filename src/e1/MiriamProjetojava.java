import java.util.Scanner;

class EstruturaAvancada  
   {
   private final String[] a;                 
   private int nElems;              
  
   public EstruturaAvancada(int max)         
      {
      a = new String[max];                 
      nElems = 0;                     
      }

   public boolean find(String searchKey)
      {                             
      int j;
      boolean achou=false;
      for(j=0; j<nElems; j++)            
         if(a[j].charAt(0) == searchKey.charAt(0)) {          
            System.out.println("Encontrei o nome: " + a[j]);  
            achou=true;
      }
        return achou;
      } 

   public void insert(String value)   
      {
      a[nElems] = value;            
      nElems++;                     
      }

   public boolean delete(String value)
      {
      int j;
      for(j=0; j<nElems; j++)        
         if( value == null ? a[j] == null : value.equals(a[j]) )
            break;
      if(j==nElems)                  
         return false;
      else                           
         {
         for(int k=j; k<nElems; k++)
            a[k] = a[k+1];
         nElems--;                   
         return true;
         }
      }  

   public void display()             
      {
      for(int j=0; j<nElems; j++)      
         System.out.print(a[j] + " ");  
      System.out.println("");
      }
  
   }  
class VetorAvancadoApp
   {
   public static void main(String[] args)
      {
      Scanner entrada = new Scanner (System.in);
      int maxSize = 5;          
      EstruturaAvancada arr = new EstruturaAvancada(maxSize); 
      
      System.out.println("Seja Bem Vindo!!!");
      
      for (maxSize = 0; maxSize < 5; maxSize++)
      {
        System.out.println("Digite o " + (maxSize+1) + "o nome: ");
        arr.insert(entrada.nextLine());               
      }
      System.out.println("");
      System.out.print("#Vetor:= ");
      arr.display();                
      System.out.println("");
      System.out.println("otimo! Agora que  colocou  os nomes, digite uma letra");
      
      
      String searchKey = entrada.nextLine();           
      
      if (!arr.find(searchKey))
        System.out.println("Nao encontrei nomes iniciados com essa letra !!! := " + searchKey);
      }  
   }  


package miriam.projetojava;

/**
 *
 * @author Aluno
 */
public class MiriamProjetojava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
