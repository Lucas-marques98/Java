public class Aula07 {
  public static void main(String[] args){
    int [] num = new int[5]; // criando Array do tipo inteiro com 5 indices
    int [] numeros = {10,20,30,40}; // criando arrays e ja adicionando sem instanciar com NEW

    num[0]=10; //adicionando elemntos no Array // começo sempre pelo indice 0
    num[1]=20;   
    num[2]=30;
    num[3]=40;
    
    System.out.printf("%d , %d , %d",num[0], num[1], num[2]); // mostrando os valores dos elementos do Array
    
    String [] texto = new String[3];

    texto[0] = "Lucas";
    texto[1] = "Milena";
    texto[2] = "Neide";
    texto[3] = "Marques";
    
    System.out.printf("%s , %s" ,texto[0], texto[1]);
    

  }
}



// int [] num = new int[5]; Instanciando uma class com new, e dizendo que quero um Array do tipo inteiro com 5 posições // ele é criado vázio, sem elementos dentro