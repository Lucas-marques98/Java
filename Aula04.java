//    CONDIÇÕES SWITCH CASE


public class Aula04 {
  public static void main(String[] args){

    int pos=5; //valor da posição

    switch(pos){
      case 1: // case = (caso) 
      // se a posição for o numero 1
      System.out.println("Primeiro Lugar");
      break;
      // se a posição for o numero 2
      case 2:  
      System.out.println("Segundo Lugar");
      break;
      // se a posição for o 3
      case 3:
      System.out.println("Terceiro Lugar");
      case 4: case 5: case 6:
      System.out.println("Premio de Participação");
      break;
      // se não for nenhuma posição // (default = condição padrão)
      default:
      System.out.println("Não ganhou premio");
      break;

    }
  }
}

//Switch ele vai avaliar uma Váriavel ou constante e dependendo do Resultado, ele vai entrar em um Caso e executar os comandos desse caso.